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

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext ctx = null;

    public Triangle() {
        System.out.println("In no-arg Triangle c'tor");
    }

    public Point getPointA() {
        return pointA;
    }


    public void setPointA(Point pointA) {
        System.out.println("Setting PointA");
        this.pointA = pointA;
    }


    public Point getPointB() {
        return pointB;
    }


    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }


    public Point getPointC() {
        return pointC;
    }


    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    public void draw() {
        System.out.println("In Triangle Draw");
        System.out.println("PointA: " + pointA.toString());
        System.out.println("PointB: " + pointB.toString());
        System.out.println("PointC: " + pointC.toString());

    }

    public void setBeanName(String name) {
        System.out.println("Bean Name: " + name);
        // name is always bean id and neither alias not bean name
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting ApplicationContext");
        this.ctx = applicationContext;

        /*
         * Now once you have application context, then you can do multiple things with
         * this. e.g. rather defining Point Bean in xml file, you can call
         * ctx.getBean("pointX") and set it in the setter functions
         */
    }
}
