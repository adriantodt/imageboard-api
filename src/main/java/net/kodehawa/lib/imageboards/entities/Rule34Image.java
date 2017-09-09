/*
 * Copyright (C) 2016-2017 David Alejandro Rubio Escares / Kodehawa
 *
 * Mantaro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Mantaro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 */

package net.kodehawa.lib.imageboards.entities;

public class Rule34Image {

    private String directory;
    private String image;
    private int height;
    private String tags;
    private int width;

    //Backwards-compatible.
    public String getFile_url() {
        return "https://img.rule34.xxx/images/" + directory + "/" + image;
    }

    public String getImageUrl(){
        return getFile_url();
    }

    public int getHeight() {
        return height;
    }

    public String getTags() {
        return tags;
    }

    public int getWidth() {
        return width;
    }
}
