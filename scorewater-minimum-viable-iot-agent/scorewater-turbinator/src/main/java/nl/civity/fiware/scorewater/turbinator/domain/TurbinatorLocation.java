/*
 * Copyright (c) 2022, Civity BV Zeist
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * Neither the name of the copyright holder nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software without 
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package nl.civity.fiware.scorewater.turbinator.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import nl.civity.scorewater.fiware.datamodel.ObservedIdentifier;

/**
 *
 * @author basvanmeulebrouk
 */
@Entity
public class TurbinatorLocation implements Serializable, Comparable<TurbinatorLocation> {
    
    @Id
    private ObservedIdentifier primaryKey;
    Double lon;
    Double lat;
    Integer batlvl;
    Double fw;

    public TurbinatorLocation() {
    }

    public TurbinatorLocation(String entityId, ZonedDateTime recordingTimestamp, Double fw, Double lon, Double lat, Integer batlvl) {
        this.primaryKey = new ObservedIdentifier(entityId, recordingTimestamp);
        this.fw = fw;
        this.lon = lon;
        this.lat = lat;
        this.batlvl = batlvl;
    }


    public TurbinatorLocation(String entityId, ZonedDateTime recordingTimestamp, Double fw, Double lon, Double lat) {
        this.primaryKey = new ObservedIdentifier(entityId, recordingTimestamp);
        this.fw = fw;
        this.lon = lon;
        this.lat = lat;
    }

    public TurbinatorLocation(String entityId, ZonedDateTime recordingTimestamp, Double fw, Integer batlvl) {
        this.primaryKey = new ObservedIdentifier(entityId, recordingTimestamp);
        this.fw = fw;
        this.batlvl = batlvl;
    }

    public TurbinatorLocation(String entityId, ZonedDateTime recordingTimestamp, Double fw) {
        this.primaryKey = new ObservedIdentifier(entityId, recordingTimestamp);
        this.fw = fw;
    }

    public ObservedIdentifier getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(ObservedIdentifier primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getBatlvl() {
        return batlvl;
    }

    public void setBatlvl(Integer batlvl) {
        this.batlvl = batlvl;
    }

    public Double getFw() {
        return fw;
    }

    public void setFw(Double fw) {
        this.fw = fw;
    }

    @Override
    public int compareTo(TurbinatorLocation that) {
        return this.getPrimaryKey().compareTo(that.getPrimaryKey());
    }
}
