/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
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
 */
package com.xeiam.xchange.dto.marketdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * DTO representing a collection of trades
 * </p>
 */
public final class Trades {

  private final List<Trade> trades;
  private final long id;

  /**
   * Constructor
   * 
   * @param trades The list of trades
   */
  public Trades(List<Trade> trades) {

    this.trades = new ArrayList<Trade>(trades);
    this.id = 0L;
  }

  /**
   * Constructor
   * 
   * @param trades The list of trades
   */
  public Trades(List<Trade> trades, long id) {

    this.trades = new ArrayList<Trade>(trades);
    this.id = id;
  }

  /**
   * @return A list of trades ordered by timestamp
   */
  public List<Trade> getTrades() {

    Collections.sort(trades);
    return trades;
  }

  /**
   * @return a Unique ID for the fetched trades
   */
  public long getId() {

    return id;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder("Trades\n");
    for (Trade trade : getTrades()) {
      sb.append("[trade=");
      sb.append(trade.toString());
      sb.append("]\n");
    }
    return sb.toString();
  }

}
