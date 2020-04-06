package org.apache.hudi.hive;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.plan.PartitionDesc;
import java.io.IOException;
import java.util.Map;

public class HudiHiveUtils {
    public static PartitionDesc getPartitionDescFromPathRecursively(Map<Path, PartitionDesc> pathToPartitionInfo, Path dir, Map<Map<Path, PartitionDesc>, Map<Path, PartitionDesc>> cacheMap) throws IOException {
        return getPartitionDescFromPathRecursively(pathToPartitionInfo, dir, cacheMap, false);
    }
}
