package jjlwpd;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.libdmtx.DMTXImage;
import org.libdmtx.DMTXTag;

/**
 *
 * dmtx.dll must be accessible to the JVM. E.g., in java.library.path: java
 * -Djava.library.path=/path/to/dir
 *
 */
public class Decode {

    public static void main(String[] args) throws IOException {

        DMTXImage lDImg = new DMTXImage(ImageIO.read(new File(args[0])));
        DMTXTag[] tags = lDImg.getTags(2, 10000); // max 2 tags, max 10 second timeout
        for(DMTXTag tag : tags) {
            System.out.println(String.format("'%s' decoded at (%d,%d) (%d,%d) (%d,%d) (%d,%d)",
                    tag.id,
                    tag.corner1.x, tag.corner1.y,
                    tag.corner2.x, tag.corner2.y,
                    tag.corner3.x, tag.corner3.y,
                    tag.corner4.x, tag.corner4.y
            ));
        }

    }

}
