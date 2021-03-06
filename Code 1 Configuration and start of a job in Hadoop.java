class WordCount {

public static void main(String[] args) throws Exception {
JobConf conf = new JobConf(WordCount.class);

conf.setInputFormat(TextInputFormat.class);
FileInputFormat.setInputPaths(conf,
new Path("/some/input/directory/in/the/hdfs/"));

conf.setOutputKeyClass(Text.class);
conf.setOutputValueClass(IntWritable.class);

conf.setOutputFormat(TextOutputFormat.class);
FileOutputFormat.setOutputPath(conf,
new Path("/some/output/directory/in/the/hdfs/"));

conf.setMapperClass(Map.class);
conf.setReducerClass(Reduce.class);

JobClient.runJob(conf);
}
}