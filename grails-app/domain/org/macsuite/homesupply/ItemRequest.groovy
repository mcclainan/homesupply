package org.macsuite.homesupply

class ItemRequest {
    User user
    User shopper
    String status
    Date dateCreated
    Date dateCompleted
    static belongsTo = [item:Item]

    static constraints = {
        status inList: ['pending','purchased','rejected']
        dateCompleted nullable: true
        dateCreated nullable: true
        shopper nullable: true
    }

    def afterInsert(){
        item.requested = true
        item.save()
    }

    def afterUpdate(){
        if(status!='pending'){
            item.requested = false
            item.save()
        }else{
            item.requested = true
            item.save()
        }
    }

    def afterDelete(){
        item.requested = false
        item.save()
    }


}
