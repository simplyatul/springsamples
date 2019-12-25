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
 * https://javabrains.io/courses/spring_core/lessons/Bean-Autowiring/
 * https://javabrains.io/courses/spring_core/lessons/Using-ApplicationContextAware/
 * Demonstrate Autowire
 * If you have large amount of Beans, then it is recommended to got for 
 * Explicit bean declaration than autowiring 
 *
 * Use of ApplicationContextAware
 */

import org.simplyatul.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_4.xml");
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring_4.xml");
        ctx.registerShutdownHook();
        /* Ref: https://javabrains.io/courses/spring_core/lessons/Lifecycle-Callbacks/
         * Only after register shutdown hook, Triangle::destroy() and
         * Triangle::myDestroy() works
         *
         * The alternate way is to do via declaring init and destroy method in xml
         * see init-method and destroy-method
         *
         * Another alternate wya is implementing BeanPostProcessor
         * Ref: https://javabrains.io/courses/spring_core/lessons/Writing-a-BeanPostProcessor/
         * Advantage is this can be common post init methods for all the Beans
         * In above way, one has to write init/destroy method in every Bean
         */

        Triangle t = (Triangle) ctx.getBean("triangle-alias");
        t.draw();
    }

}
