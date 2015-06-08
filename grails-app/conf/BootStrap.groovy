import grails.util.Environment
import org.macsuite.homesupply.Category
import org.macsuite.homesupply.Item
import org.macsuite.homesupply.ItemClass
import org.macsuite.homesupply.ItemRequest
import org.macsuite.homesupply.Role
import org.macsuite.homesupply.User
import org.macsuite.homesupply.UserRole

class BootStrap {
    Role role
    User user
    ItemClass itemClass
    Category category
    Item item

    def init = { servletContext ->
        switch (Environment.current){
            case Environment.DEVELOPMENT:
                createDevData()
                break
            case Environment.TEST:
                break
            case Environment.PRODUCTION:
                createAdmin()
                break
        }
        createAdmin()
    }

    def createDevData(){
        createRoles()
        createAdmin()
        createShopper()
		createItemClasses()
        createCategories()
        createItems()
        createUsers()
        createRequests()
    }

    def createRoles(){
        Role.findByAuthority('ROLE_ADMIN')?:new Role(authority:'ROLE_ADMIN').save(failOnError:true)
        Role.findByAuthority('ROLE_SHOPPER')?:new Role(authority:'ROLE_SHOPPER').save(failOnError:true)
        Role.findByAuthority('ROLE_HOME_SUPPLY_USER')?:new Role(authority:'ROLE_HOME_SUPPLY_USER').save(failOnError:true)
    }

    def createAdmin(){
        role = Role.findByAuthority('ROLE_ADMIN')
        user = User.findByUsername('super')?:new User(username:'super',firstName: "Admin", lastName: 'User', email: 'mcclainan@gmail.com', enabled:true,password:'Love@shine1star').save(failOnError:true)
        if(!user.authorities.contains(role)){
            UserRole.create(user,role,true)
        }
    }

    def createShopper(){
        role = Role.findByAuthority('ROLE_SHOPPER')
        user = User.findByUsername('shopper')?:new User(username:'shopper',firstName: "Shopping", lastName: 'User', email: 'mcclainan@gmail.com', enabled:true,password:'password').save(failOnError:true)
        if(!user.authorities.contains(role)){
            UserRole.create(user,role,true)
        }
    }

    def createUsers(){
        role = Role.findByAuthority('ROLE_HOME_SUPPLY_USER')
        user = User.findByUsername('user')?:new User(username:'user',firstName: "Standard", lastName: 'User', email: 'mcclainan@gmail.com', enabled:true,password:'password').save(failOnError:true)
        if(!user.authorities.contains(role)){
            UserRole.create(user,role,true)
        }
    }


	def createItemClasses(){
		new ItemClass(name:'Food', description:'Stuff that is eaten').save(failOnError:true)
		new ItemClass(name:'Clothing', description:'Stuff that is worn').save(failOnError:true)
		new ItemClass(name:'Cleaning Supplies', description:'Stuff that is used to clean').save(failOnError:true)
		new ItemClass(name:'School Supplies', description:'Stuff that is used for school').save(failOnError:true)
        new ItemClass(name:'Personal', description:'Stuff that is for personal use').save(failOnError:true)
	}
    
    def createCategories(){
        itemClass = ItemClass.findByName('Food')
        new Category(itemClass:itemClass, name:'Meat',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Grain',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Dairy',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Vegetables',description: '').save(failOnError: true)
        itemClass = ItemClass.findByName('Clothing')
        new Category(itemClass:itemClass, name:'Shoes',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Over Clothes',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Under Clothes',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Other',description: '').save(failOnError: true)
        itemClass = ItemClass.findByName('Cleaning Supplies')
        new Category(itemClass:itemClass, name:'Kitchen',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Bathroom',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Floor',description: '').save(failOnError: true)
        itemClass = ItemClass.findByName('School Supplies')
        new Category(itemClass:itemClass, name:'Supplies',description: '').save(failOnError: true)
        itemClass = ItemClass.findByName('Personal')
        new Category(itemClass:itemClass, name:'Hygiene',description: '').save(failOnError: true)
        new Category(itemClass:itemClass, name:'Miscellaneous',description: '').save(failOnError: true)
    }

    def createItems(){
        category = Category.findByName('Meat')
        new Item(category: category, name: 'Ground Turkey').save(failOnError: true)
        new Item(category: category, name: 'Chicken',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Salmon').save(failOnError: true)
        new Item(category: category, name: 'Hambuger',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Bratwurst').save(failOnError: true)
        category = Category.findByName('Grain')
        new Item(category: category, name: 'Spaghetti').save(failOnError: true)
        new Item(category: category, name: 'Bread',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Cracker',requested: true).save(failOnError: true)
        category = Category.findByName('Dairy')
        new Item(category: category, name: 'Soy Milk',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Organic Milk',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Cheese',requested: true).save(failOnError: true)
        category = Category.findByName('Vegetables')
        new Item(category: category, name: 'Broccoli',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Green Beans').save(failOnError: true)
        new Item(category: category, name: 'Corn').save(failOnError: true)
        category = Category.findByName('Shoes')
        new Item(category: category, name: 'Running').save(failOnError: true)
        new Item(category: category, name: 'Dress').save(failOnError: true)
        category = Category.findByName('Over Clothes')
        new Item(category: category, name: 'Pants').save(failOnError: true)
        new Item(category: category, name: 'Shirt').save(failOnError: true)
        category = Category.findByName('Under Clothes')
        new Item(category: category, name: 'Underwear').save(failOnError: true)
        new Item(category: category, name: 'Socks',requested: true).save(failOnError: true)
        category = Category.findByName('Other')
        new Item(category: category, name: 'Hair Pin',requested: true, temporary: true).save(failOnError: true)
        new Item(category: category, name: 'Hat').save(failOnError: true)
        category = Category.findByName('Kitchen')
        new Item(category: category, name: 'Dish Soap').save(failOnError: true)
        new Item(category: category, name: 'Wash rags').save(failOnError: true)
        new Item(category: category, name: 'Scratch Pads',requested: true).save(failOnError: true)
        category = Category.findByName('Bathroom')
        new Item(category: category, name: 'Toilet Cleaner').save(failOnError: true)
        new Item(category: category, name: 'Bathroom Cleaner',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Windex').save(failOnError: true)
        category = Category.findByName('Floor')
        new Item(category: category, name: 'Pinesol').save(failOnError: true)
        new Item(category: category, name: 'Mop',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Broom').save(failOnError: true)
        category = Category.findByName('Hygiene')
        new Item(category: category, name: 'Soap').save(failOnError: true)
        new Item(category: category, name: 'Deodorant',requested: true).save(failOnError: true)
        new Item(category: category, name: 'Toothbrush').save(failOnError: true)
        category = Category.findByName('Miscellaneous')
        new Item(category: category, name: 'Perfume',requested: true, temporary: true).save(failOnError: true)
    }

    def createRequests(){
        user = User.findByUsername("user")
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Hambuger")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Chicken")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Bread")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Cracker")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Soy Milk")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Organic Milk")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Cheese")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Broccoli")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Socks")).save(failOnError: true)
        new ItemRequest(user: user,status:'rejected', item: Item.findByName("Perfume")).save(failOnError: true)
        new ItemRequest(user: user,status:'pending', item: Item.findByName("Deodorant")).save(failOnError: true)
        def itemRequest = new ItemRequest(user: user,status:'pending', item: Item.findByName("Mop")).save(failOnError: true)
        itemRequest.dateCreated = itemRequest.dateCreated - 1
        itemRequest.save(failOnError: true)
        itemRequest = new ItemRequest(user: user,status:'pending', item: Item.findByName("Bathroom Cleaner")).save(failOnError: true)
        itemRequest.dateCreated = itemRequest.dateCreated - 1
        itemRequest.save(failOnError: true)
        itemRequest = new ItemRequest(user: user,status:'pending', item: Item.findByName("Scratch Pads")).save(failOnError: true)
        itemRequest.dateCreated = itemRequest.dateCreated - 1
        itemRequest.save(failOnError: true)
        itemRequest = new ItemRequest(user: user,status:'pending', item: Item.findByName("Hair Pin")).save(failOnError: true)
        itemRequest.dateCreated = itemRequest.dateCreated - 1
        itemRequest.save(failOnError: true)
    }

}
