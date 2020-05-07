package org.launchcode.skillstracker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("Studio")
public class SkillsController {

    @GetMapping("home")
    public String skillsHome() {
        return "" +
                "<html>" +
                    "<body style='background-color:lightblue;'>" +
                        "<h1 style='color:green; background-color:black; text-align:center;'>Skills Tracker</h1>" +
                        "<h2 style='color:green; background-color:black; text-align:center;'>We have a few skills we would like to learn! Here's the list!</h2>" +
                        "<table>" +
                            "<tr>" +
                                "<th>Programming Languages</th>" +
                                "<th>Markup Languages</th>" +
                                "<th>Style Sheet Languages</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>Java</td>" +
                                "<td>HTML</td>" +
                                "<td>CSS</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>C++</td>" +
                                "<td>XHTML</td>" +
                                "<td>XSL</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>Python</td>" +
                                "<td>VHML</td>" +
                                "<td>DSSSL</td>" +
                            "</tr>" +
                        "</table>" +
                "<a href='http://localhost:8080/Studio/form'>To Form</a>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String langForm() {
        return "" +
                "<html>" +
                    "<body>" +
                        "<form action='formPage' method='post'>" +
                            "<label for='nameText'>Name:</label></br>" +
                            "<input type='text' name='name' id='nameText' placeholder='Enter Your Name'></br>" +
                            "<label for='first'>My favorite language:</label></br>" +
                            "<select name='language1' id='first'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='Python'>Python</option>" +
                                "<option value='XHTML'>XHTML</option>" +
                                "<option value='CSS'>CSS</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "<option value='XSL'>XSL</option>" +
                                "<option value='VHML'>VHML</option>" +
                                "<option value='DSSSL'>DSSSL</option>" +
                            "</select></br>" +
                            "<label for='second'>My second favorite language:</label></br>" +
                            "<select name='language2' id='second'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='Python'>Python</option>" +
                                "<option value='XHTML'>XHTML</option>" +
                                "<option value='CSS'>CSS</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "<option value='XSL'>XSL</option>" +
                                "<option value='VHML'>VHML</option>" +
                                "<option value='DSSSL'>DSSSL</option>" +
                            "</select></br>" +
                            "<label for='third'>My third favorite language:</label></br>" +
                            "<select name='language3' id='third'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='C++'>C++</option>" +
                                "<option value='Python'>Python</option>" +
                                "<option value='XHMTL'>XHTML</option>" +
                                "<option value='CSS'>CSS</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "<option value='XSL'>XSL</option>" +
                                "<option value='VHML'>VHML</option>" +
                                "<option value='DSSSL'>DSSSL</option>" +
                            "</select></br>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "formPage")
    public String formPage(@RequestParam String name, String language1, String language2, String language3) {
        return "" +
                "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + language1 + "</li>" +
                            "<li>" + language2 + "</li>" +
                            "<li>" + language3 + "</li>" +
                        "</ol>" +
                "<a href='http://localhost:8080/Studio/form'>Return to form</a>   " +
                "<a href='http://localhost:8080/Studio/home'>Return Home</a>" +
                    "</body>" +
                "</html>";
    }
}
