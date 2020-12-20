package client.utils;

import javax.swing.*;
import java.awt.*;


// Use to load Icon and resize specific dimension
public class IconHandle {
    public static ImageIcon loadIcon(String path, Dimension dimension) {
        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImage);
    }
}
