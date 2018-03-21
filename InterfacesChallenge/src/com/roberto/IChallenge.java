package com.roberto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberto Affonso, created on 10/01/18
 **/

public interface IChallenge {
    List<String> saveValues();
    void readValues(List<String> saved);

}
