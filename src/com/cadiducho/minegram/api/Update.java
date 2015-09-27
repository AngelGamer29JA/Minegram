/*
 * The MIT License
 *
 * Copyright 2015 Cadiducho.
 * Read more in https://github.com/Cadiducho/Minegram/blob/master/LICENSE
 */

package com.cadiducho.minegram.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This object represents an incoming update.
 */
@ToString
@Getter @Setter
public class Update {
    
    /**
     * The update‘s unique identifier. 
     * Update identifiers start from a certain positive number and increase sequentially. 
     * This ID becomes especially handy if you’re using Webhooks, 
     * since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
     */
    private Integer update_id;
    
    /**
     * Optional. New incoming message of any kind — text, photo, sticker, etc.
     */
    private Message message;

}