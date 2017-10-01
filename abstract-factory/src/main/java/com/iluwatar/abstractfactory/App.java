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
package com.iluwatar.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that have a common theme
 * without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of
 * the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part
 * of the theme. The client does not know (or care) which concrete objects it gets from each of these internal
 * factories, since it uses only the generic interfaces of their products. This pattern separates the details of
 * implementation of a set of objects from their general usage and relies on object composition, as object creation is
 * implemented in methods exposed in the factory interface.
 * <p>
 * The essence of the Abstract Factory pattern is a factory interface ({@link KingdomFactory}) and its implementations (
 * {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). The example uses both concrete implementations to create a
 * king, a castle and an army.
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

//  private King king;
//  private Castle castle;
//  private Army army;

  /**
   * Creates kingdom
   */
//  public void createKingdom(final KingdomFactory factory) {
//    this.king = factory.createKing();
//    this.castle = factory.createCastle();
//    this.army = factory.createArmy();
//  }
//
//  King getKing(final KingdomFactory factory) {
//    return factory.createKing();
//  }
//
//  public King getKing() {
//    return king;
//  }
//
//  Castle getCastle(final KingdomFactory factory) {
//    return factory.createCastle();
//  }
//
//  public Castle getCastle() {
//    return castle;
//  }
//
//  Army getArmy(final KingdomFactory factory) {
//    return factory.createArmy();
//  }
//
//  public Army getArmy() {
//    return army;
//  }

  
  /**
   * Program entry point
   * 
   * @param args
   *          command line args
   */
  public static void main(String[] args) {

 //   App app = new App();

    LOGGER.info("Elf Kingdom with FactoryProducer");
    Kingdom elfKingdom = FactoryProducer.createKingdom("Elf");
    LOGGER.info(elfKingdom.getArmy().getDescription());
    LOGGER.info(elfKingdom.getCastle().getDescription());
    LOGGER.info(elfKingdom.getKing().getDescription());

    LOGGER.info("Orc Kingdom with FactoryProducer");
    Kingdom orcKingdom = FactoryProducer.createKingdom("Orc");
    LOGGER.info(orcKingdom.getArmy().getDescription());
    LOGGER.info(orcKingdom.getCastle().getDescription());
    LOGGER.info(orcKingdom.getKing().getDescription());

//    LOGGER.info("Elf Kingdom");
//    app.createKingdom(new ElfKingdomFactory());
//    LOGGER.info(app.getArmy().getDescription());
//    LOGGER.info(app.getCastle().getDescription());
//    LOGGER.info(app.getKing().getDescription());
//
//    LOGGER.info("Orc Kingdom");
//    app.createKingdom(new OrcKingdomFactory());
//    LOGGER.info(app.getArmy().getDescription());
//    LOGGER.info(app.getCastle().getDescription());
//    LOGGER.info(app.getKing().getDescription());
//
//    // Verbesserungspotential (Vermeidung von new)
//    LOGGER.info("Elf Kingdom via FactoryProducer");
//    app.createKingdom(KingdomFactoryProducer.getFactory("elf"));
//    LOGGER.info(app.getArmy().getDescription());
//    LOGGER.info(app.getCastle().getDescription());
//    LOGGER.info(app.getKing().getDescription());
  }
}
