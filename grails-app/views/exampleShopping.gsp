<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 6/2/15
  Time: 3:34 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div id="page-wrapper">
    <!-- Main -->
    <section id="main" class="container">
        <header>
            <h2>Shopping</h2>
        </header>
        <div class="row">
            <div class="12u">

                <!-- Table -->
                <section class="box">
                    <h3>Table</h3>
                    <div class="table-wrapper">
                        <table>
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>Description</th>
                                <th>Price</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>
                            <tr>
                                <td>Something to purchase for dinner</td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                                <td><a href="#" class="button special small fit">Small</a></td>
                            </tr>

                            </tbody>
                            <tfoot>
                            <tr>
                                <td colspan="2"></td>
                                <td>100.00</td>
                            </tr>
                            </tfoot>
                        </table>
                    </div>
                </section>

            </div>
        </div>
        <div class="row">
            <div class="12u">

                <!-- Buttons -->
                <section class="box">
                    <h3>Buttons</h3>
                    <ul class="actions">
                        <li><a href="#" class="button special">Special</a></li>
                        <li><a href="#" class="button">Default</a></li>
                        <li><a href="#" class="button alt">Alternate</a></li>
                    </ul>
                    <ul class="actions">
                        <li><a href="#" class="button special big">Big</a></li>
                        <li><a href="#" class="button">Default</a></li>
                        <li><a href="#" class="button alt small">Small</a></li>
                    </ul>
                    <ul class="actions fit">
                        <li><a href="#" class="button special fit">Fit</a></li>
                        <li><a href="#" class="button fit">Fit</a></li>
                        <li><a href="#" class="button alt fit">Fit</a></li>
                    </ul>
                    <ul class="actions fit small">
                        <li><a href="#" class="button special fit small">Fit + Small</a></li>
                        <li><a href="#" class="button fit small">Fit + Small</a></li>
                        <li><a href="#" class="button alt fit small">Fit + Small</a></li>
                    </ul>
                    <ul class="actions">
                        <li><a href="#" class="button special icon fa-search">Icon</a></li>
                        <li><a href="#" class="button icon fa-download">Icon</a></li>
                        <li><a href="#" class="button alt icon fa-check">Icon</a></li>
                    </ul>
                    <ul class="actions">
                        <li><span class="button special disabled">Special</span></li>
                        <li><span class="button disabled">Default</span></li>
                        <li><span class="button alt disabled">Alternate</span></li>
                    </ul>
                </section>

            </div>
        </div>
        <div class="row">
            <div class="12u">

                <!-- Form -->
                <section class="box">
                    <h3>Form</h3>
                    <form method="post" action="#">
                        <div class="row uniform 50%">
                            <div class="6u 12u(mobilep)">
                                <input type="text" name="name" id="name" value="" placeholder="Name" />
                            </div>
                            <div class="6u 12u(mobilep)">
                                <input type="email" name="email" id="email" value="" placeholder="Email" />
                            </div>
                        </div>
                        <div class="row uniform 50%">
                            <div class="12u">
                                <div class="select-wrapper">
                                    <select name="category" id="category">
                                        <option value="">- Category -</option>
                                        <option value="1">Manufacturing</option>
                                        <option value="1">Shipping</option>
                                        <option value="1">Administration</option>
                                        <option value="1">Human Resources</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row uniform 50%">
                            <div class="4u 12u(narrower)">
                                <input type="radio" id="priority-low" name="priority" checked>
                                <label for="priority-low">Low Priority</label>
                            </div>
                            <div class="4u 12u(narrower)">
                                <input type="radio" id="priority-normal" name="priority">
                                <label for="priority-normal">Normal Priority</label>
                            </div>
                            <div class="4u 12u(narrower)">
                                <input type="radio" id="priority-high" name="priority">
                                <label for="priority-high">High Priority</label>
                            </div>
                        </div>
                        <div class="row uniform 50%">
                            <div class="6u 12u(narrower)">
                                <input type="checkbox" id="copy" name="copy">
                                <label for="copy">Email me a copy of this message</label>
                            </div>
                            <div class="6u 12u(narrower)">
                                <input type="checkbox" id="human" name="human" checked>
                                <label for="human">I am a human and not a robot</label>
                            </div>
                        </div>
                        <div class="row uniform 50%">
                            <div class="12u">
                                <textarea name="message" id="message" placeholder="Enter your message" rows="6"></textarea>
                            </div>
                        </div>
                        <div class="row uniform">
                            <div class="12u">
                                <ul class="actions">
                                    <li><input type="submit" value="Send Message" /></li>
                                    <li><input type="reset" value="Reset" class="alt" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>

                    <hr />

                    <form method="post" action="#">
                        <div class="row uniform 50%">
                            <div class="9u 12u(mobilep)">
                                <input type="text" name="query" id="query" value="" placeholder="Query" />
                            </div>
                            <div class="3u 12u(mobilep)">
                                <input type="submit" value="Search" class="fit" />
                            </div>
                        </div>
                    </form>
                </section>

            </div>
        </div>
        <div class="row">
            <div class="12u">

                <!-- Image -->
                <section class="box">
                    <h3>Image</h3>
                    <h4>Fit</h4>
                    <span class="image fit"><img src="images/pic04.jpg" alt="" /></span>
                    <div class="box alt">
                        <div class="row no-collapse 50% uniform">
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                        </div>
                        <div class="row no-collapse 50% uniform">
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                        </div>
                        <div class="row no-collapse 50% uniform">
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                            <div class="4u"><span class="image fit"><img src="images/pic04.jpg" alt="" /></span></div>
                        </div>
                    </div>

                    <h4>Left &amp; Right</h4>
                    <p><span class="image left"><img src="images/pic05.jpg" alt="" /></span>Fringilla nisl. Donec accumsan interdum nisi, quis tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent. Donec accumsan interdum nisi, quis tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent.</p>
                    <p><span class="image right"><img src="images/pic05.jpg" alt="" /></span>Fringilla nisl. Donec accumsan interdum nisi, quis tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent. Donec accumsan interdum nisi, quis tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent tincidunt felis sagittis eget. tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan eu faucibus. Integer ac pellentesque praesent.</p>
                </section>

            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer id="footer">
        <ul class="icons">
            <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
            <li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
            <li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
            <li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
        </ul>
        <ul class="copyright">
            <li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
        </ul>
    </footer>

</div>
</body>
</html>