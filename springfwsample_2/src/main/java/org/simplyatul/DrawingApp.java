/****************************************************************************
 * MIT License
 * Copyright (c) 2019 simplyatul
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
****************************************************************************/

package org.simplyatul;


/*
 * Ref: 
 * https://javabrains.io/courses/spring_core/lessons/Injecting-Objects/
 * https://javabrains.io/courses/spring_core/lessons/Inner-Beans%2C-Aliases-and-idref/
 * 
 * Diff Vs springbasic_1
 * - Setting/Initializing a member variable of another object (refer spring_2.xml)
 * - Inner Beans, Alias and idref
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_2.xml");
        //Triangle t = (Triangle) ctx.getBean("triangle-alias"); // This will work too
        Triangle t = (Triangle) ctx.getBean("triangle-name");
        t.draw();
    }

}
