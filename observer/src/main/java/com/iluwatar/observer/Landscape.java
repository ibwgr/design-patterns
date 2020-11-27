/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Weather can be observed by implementing {@link ConditionObserver} interface and registering as
 * listener.
 *
 *
 * Die Klasse ist das Subject und enthält bereits Methoden zum Hinzufügen und Entfernen von Observern ({@link ConditionObserver})
 * @todo: es fehlt allerdings noch die Funktionalität um Observer über Änderungen zu benachrichten, füge diese hinzu
 */
public class Landscape extends Condition {

  private static final Logger LOGGER = LoggerFactory.getLogger(Landscape.class);

  private LandscapeType currentLandscape;

  public Landscape() {
    currentLandscape = LandscapeType.HILLY;
  }


  public void timePasses() {
    LandscapeType[] enumValues = LandscapeType.values();
    currentLandscape = enumValues[(currentLandscape.ordinal() + 1) % enumValues.length];
    LOGGER.info("The landscape changed to {}.", currentLandscape);
    notifyObservers(this);
  }

  public LandscapeType getLandscape(){
        return currentLandscape;
  }

}
