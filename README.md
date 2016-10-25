# LogToFileUtils
把日志写入到文件的工具类，优先顺序 SD卡->外部存储->内部存储，三者按顺序自动选择




使用方法：

1：初始化
FileLogUtils.init(Context);

2：使用
FileLogUtils.write("Hello Word！"); 



志文件路径：

	若存在SD卡或者外部存储，则在 SD\Android\data\包名\files\Log\logs.txt

	若不存在SD卡或者外部存储，则在 \data\data\包名\files\Log\logs.txt

