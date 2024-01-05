package com.cadastrobeneficiarios.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeneficiaryTest {

    @Test
    public void testNewBeneficiary() {
        Assertions.assertNotNull( new Beneficiary());
    }
}
