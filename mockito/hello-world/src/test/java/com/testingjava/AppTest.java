package com.testingjava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class AppTest {
    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    CustomerApplication customerService = new CustomerApplication();
    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CustomerService mock;


    @Test
    public void saveTest() {


        Customer customer = new Customer("john", "smith");
        when(mock.save(customer)).thenReturn(1);
        Assert.assertEquals(mock.save(customer), 1);
        verify(mock, times(1)).save(customer);

    }
}