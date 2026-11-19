# 中育 Android 应用与画板

11 个应用均有可重新编译的 smali 工程、反混淆 Java 阅读源和逐应用报告。[重建的 APK](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [画板与存储格式](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md) · [领创与中育接口、认证证据](https://github.com/Loshop-Studio/linspirer-android-reverse/blob/main/reports/%E9%A2%86%E5%88%9B%E4%B8%8E%E4%B8%AD%E8%82%B2%E6%8E%A5%E5%8F%A3.md)

## 打开 Flutter 画板

在本仓库根目录运行以下命令，再在浏览器中打开 [本地画板](http://127.0.0.1:8765)。网页在浏览器内读写选择的文件。现成的 Web 构建位于 `board_editor/build/web`。

```sh
python3 -m http.server 8765 --bind 127.0.0.1 --directory board_editor/build/web
```

「新建笔记或页面」可以从零建立 Blackboard V6 笔记，或在已打开的完整 V6 笔记中加一页。页面可分别保存笔迹和图文。错题本从头重放了网页新建的两页，云笔记也将它们导入为两个独立页面。[网页新建的双页笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-new-notebook.zip) · [云笔记的逐页内容](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/new-notebook-cloud.json)

点击「打开 BIN / ZIP」，可以直接打开[原生简笔板样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/art-simple.bin)或[原生 Sketch 样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/art-actions.bin)。Blackboard 可以通过「打开画板文件夹」直接选择原始目录，也可以打开保留根目录索引、每页快照和分片的 ZIP。可用[最小页面样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/schema-page.zip)试画。简笔板还可打开[原生生成的带底图草稿](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-simple-page.zip)。该样本的原生视图宽为 320 像素，底图宽为 640 像素；尺形按钮可指定原生视图宽度，使底图与笔迹对齐。按「导出」获取与输入对应的 BIN 或 ZIP。笔色、线宽、虚线与几何工具按格式提供。单独打开触摸分片时，先点选笔迹再重画，以保留原生索引。

Sketch 的「矩形」和「椭圆」各保存成一笔。可打开[网页编辑后的 V5 BIN](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-shapes/web.bin)，或试用[旧版 V1 笔记 ZIP](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-shapes/v1-web.zip)。错题本、优课畅学、新测评和随身答的原版均已重开。V2 需要整图快照，V3 需要逐笔配置，V1 将显示内容写入 JPEG 底图。[五种版本的样本及原版画面对照](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

错题本和新测评的简笔板支持整笔擦除。打开[七笔样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/simple-eraser/input.bin)，选「橡皮」，在最上方虚线的中段按下即可擦掉整条线。拖动可以继续擦除，一次撤销可恢复整次拖动。默认半径为 40，橡皮和画笔可分别调节。两个原 APK 都打开了网页导出的四笔文件，重新保存的 BIN 与各自在原画板上擦除的结果逐字节一致。[网页导出的 BIN](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/simple-eraser/web.bin) · [原版命中规则与验证](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#simpleboard-整笔擦除)

错题本原 APK 生成的两个一笔样本均经浏览器实画、导出，再由原 APK 读取为两笔。Blackboard 用原 schema 生成空页面，浏览器写入首笔后，原始读取器成功校验其路由摘要并关联命令、快照和触摸资源。原生 SimpleBoardView 还打开了浏览器导出的两笔，实际绘制、接收触摸后保存为三笔，经网页复载加笔得到四笔。同一样本在 320 × 240 下，网页与原生的深色笔迹分别有 1,137 与 1,135 个像素，其中 1,125 个位置重合。[像素对照](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/simple-preview-comparison.json) · [原生绘制图](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-simple.png) · [网页再编辑结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/browser-return.txt)

要试原应用实际保存的 V6 文件，可打开[错题本用 Android 触摸录制的两笔笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-v6-recording.zip)。它在每页目录内保存文件头。点「播放本页回放」可看原笔迹，点「返回编辑」可继续写。网页加的第三笔、错题本再加的第四笔已由两端来回读取，录制长度始终是 1149 毫秒。[四笔的最终笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/android-resaved-v6.zip) · [逐笔核对和画面比对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#错题本原录制器保存的-v6-笔记)

打开[原生双指镜头样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/camera/native.zip)，用画笔时双指拖动可平移页面。点「录制页末镜头」后可用鼠标拖动或双指缩放，导出时保留镜头轨迹。可对照[网页编辑后的笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/camera/web.zip)和[原播放器与网页的核对结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#v6-书写和查看模式的双指镜头)。

V6 笔记还可以录制指示位置的光标。点「录制页末光标」，按住拖动并松开，轨迹就会追加到本页回放，最终页面保留原有笔迹。可打开错题本的实录，比较手指和手写笔指向的位置。[原生录制](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/cursor/native.zip) · [网页追加两段轨迹后的笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/cursor/web.zip) · [五款原播放器的核对结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#v6-回放光标与页末录制)

在 V6 页面点「设置纸张」可以换空白纸、横线纸或方格纸，调整线距、底色和线色。打开错题本的实录样本，拖动回放就能看到横线变成方格。网页导出后，错题本可继续打开，中育云笔记可导入。[原生换纸录制](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/ruled-paper/native-paper.zip) · [网页改成紫色横线的笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/ruled-paper/web-paper.zip) · [五款原包的读写差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#v6-纸张的横线与方格)

V6 页面编辑后，网页导出的 ZIP 会更新页内预览，错题本列表可以直接显示新笔迹。可打开[带三笔的网页导出](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-previews/web-viewport.zip)、[可以继续写的长画布](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-previews/web-scroll.zip)或[使用 RGB565 内容缩略图的原生样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-previews/native-content.zip)。[两种预览与 Android 的逐像素核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#v6-列表预览的两种-png)

Blackboard V6 的每页录音可以播放、暂停、拖动进度，也可以点「追加本页录音」选择本地音频，在页末留出静音后保存。打开[双页录音样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-audio.zip)即可试听，第二页没有录音。五款原 APK 都能在网页导出的第三段内定位到指定时刻，中育云笔记导入后重写的录音分片与网页输出逐字节一致。选择「只听录音」可以边听边编辑。[可复载的编辑结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-page-audio.zip) · [时序、分片差异和原包证据](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#blackboard-v6-的每页录音)

打开[带画面和录音的双页 V6 笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-replay.zip)，点「播放本页回放」，可以看到笔迹逐点出现、删除、恢复，随后文字改变、笔迹平移。进度条可以往回拖。点「返回编辑」后可以续写并导出。错题本、优课畅学、新测评、随身答和中育云笔记均用自己的播放器回读了编辑前后的这段历史。[网页加笔后的笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-page-replay.zip) · [各包回放时刻和绘制对照](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#blackboard-v6-的画面回放)

Sketch 录制包可以按原生时间轴播放、暂停、拖动进度并返回编辑。打开[双音轨录制样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-recording.zip)，两段录音分别为 1.2 秒和 0.8 秒，之间 8.8 秒的停顿在原播放器和网页中都会跳过。浏览器在末尾加笔后，错题本原播放器回读到两笔，总时长仍为 2 秒。[网页回放截图](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/recording-preview.png) · [原播放器回读](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/native-player.txt)

Sketch 普通静态笔记编辑后会更新云笔记侧栏用的 JPEG。打开[错题本保存的图文样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-thumbnails/native.zip)，可看到裁切后的红线和一张双色图片。网页加笔后，四款原录制器均读回两笔和一张图，云笔记的旧侧栏显示了新笔迹。[可重开的编辑件](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-thumbnails/web.zip) · [原包显示结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-静态笔记与-jpeg-预览)

部分旧 Sketch 笔记打开后，原来的字迹和图片都在一张 JPEG 底图上。网页可以在这类笔记上加笔、导出并再次编辑。小底图按原尺寸居中。错题本已从二次编辑件里显示两次新画的线。[V1 小底图样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-thumbnails/backing-v1.zip) · [二次编辑件](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-thumbnails/backing-v1-again.zip) · [两种旧文件头的原生核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-thumbnails/backing-comparison.json)

Sketch V5 可以用双指或 Shift 拖动笔迹，也可以在「画板变换」菜单缩放，操作会保存到 BIN。打开[变换样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-transform.bin)可直接尝试。错题本、优课畅学、新测评、随身答四款原播放器均读回了平移、放大、加笔后的全部三笔，并绘出逐像素相同的原生画面。云笔记的旧播放器在读取文件头时遇到本包缺失的方法。[五款播放器结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/sketch-players.json) · [网页与原生绘制对照](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-transform-pixels.json) · [编辑后的 BIN](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-transform.bin)

Sketch 图片需连同 `actions.bin` 旁的 `res/` 目录一起打开。[图文样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/sketch-images.zip)内有两幅图片和两笔。点击「插入图片」可设显示宽度和九宫格位置。给单独的 BIN 加图时，网页会将动作和原图一起导出为 ZIP，撤销可回到原 BIN。错题本、优课畅学、新测评和随身答均已绘制网页追加第三笔和第三张图后的结果。[网页导出包](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-sketch-images.zip) · [四款播放器的位图核对及云笔记旧版错误](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/sketch-image-players.json)

带 HTML 课件的 Sketch 笔记可以翻页、播放一步动画、跳至指定页，也能直接在课件上加笔。打开[错题本原生录制器保存的三页 HTML 课件](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-sketch-presentation.zip)，选择工具栏的「课件控制」。五款原应用的同名控件都核对了五个操作。四款原播放器从网页导出的 BIN 中读回了课件和上层笔迹。[课件格式与版本差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-课件的资源翻页和录制时间) · [网页加笔后的原生课件包](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-sketch-native-presentation.zip)

Blackboard 可以同时显示分层文字、图片、椭圆和多边形。V6 页面的「编辑图元」可修改已有文字、图形样式、顶点和位置。五款原 APK 回放了同一份网页编辑包，八个检查点的图元字段均一致。中育云笔记还将其中六条完整命令写入本地数据库。[可编辑样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/artwork-edit-base.zip) · [编辑结果和原生读回](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#blackboard-v6-的文字和几何编辑)

已有 V6 图片也可以直接编辑。打开[带图片的起始页](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/artwork-edit-base.zip)，点「拖动图片」后用鼠标或手指移动图片。要绕中心等比缩放、旋转或精确平移，打开「编辑图元」并选择图片文件名。操作可以撤销、重做，导出的 ZIP 保留原 PNG。五款原应用已回放了网页写入的两次变换。[编辑后的页面](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-page-image.zip) · [原生与网页逐像素核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page-image-pixels.json)

在 Blackboard V6 页面选择「插入图元」，可以放置文字、椭圆、矩形、三角形和本地图片。页面坐标和显示宽度可调，同名图片会另存。网页导出的五个图元经过五款原应用的命令回放，错题本从快照恢复后画出的五个图元与回放的 RGBA 像素完全相同。[网页编辑结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-artwork-created.zip) · [五款原应用逐步核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/artwork-create-variants.json) · [网页和原生绘制差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/artwork-create-pixels.json)

云笔记、优课畅学、新测评、错题本、随身答的原 APK 都成功解码并重写网页导出的九类页面消息，45 组读写的解码字段一致。课堂实录中的多指手势、演示文稿和跨应用视觉一致性仍缺现场样本。[图文示例](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/artwork.png) · [五款原 APK 的逐类型核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/page-variants.json) · [Flutter 源码](https://github.com/Loshop-Studio/zhongyu-board-codec/tree/main/board_editor/lib)

```sh
cd board_editor
flutter pub get
flutter test
flutter build web --release --no-web-resources-cdn
```

错题本原生导出的 ZIP 也能直接打开。选择文件夹时会保留子目录结构，编辑后可导出 ZIP。错题本已用自己的加载器还原网页导出的 21 个文件。[错题本原生笔记包](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-note-bundle.zip) · [网页编辑后](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/folder-note-edited.zip) · [清单与文件摘要](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#错题本的笔记目录zip-和清单)

要把新格式的页式画板交给云笔记，可打开[混合样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/cloud-mixed.zip)，画一笔后点击工具栏里的「按页面 BIN 导出云笔记副本」。云笔记的原生转换器已将[网页导出的副本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/web-cloud-note.zip)写入新库，并保留笔迹、文字、图形和图片引用。副本依据页面 BIN 生成，普通「导出 ZIP」保留已有数据库。

云笔记还会写入 `page_mdb/data.mdb`。原 APK 已在本地生成并重开一个覆盖 24 种实体的库，可用 `python3 tools/read-data.py reports/evidence/board/page_mdb/data.mdb --entity PageEntity` 查看其中的页面、指令索引和关联 ID。[样本与解码结果](https://github.com/Loshop-Studio/zhongyu-board-codec/tree/main/reports/evidence/board/page_mdb)

云笔记旧版把翻页顺序保存在 `index.json`。打开[带原生页序清单的多页样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/cloud-index/native.zip)，第三个翻页位置和第一个引用同一页。在第三个位置写一笔，翻回第一个位置也会看到这笔。网页可以打开 ZIP 或解包后的文件夹。[编辑后的笔记](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/cloud-index/web.zip) · [页序、资源清单和数据库的原包实测](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记的页序和资源清单)

## 编译 APK

每个应用对应一个 Gradle 子项目，运行 `assembleDebug` 会生成 `dist/<应用>.apk`。修改应用时可按下表找到参与构建的文件。

| 修改内容 | 文件位置 |
|---|---|
| 应用逻辑 | `android/<应用>/smali*/`。JADX 生成的 `sources/<应用>/java/` 用于对照阅读。 |
| 界面文字、布局、图片 | `sources/<应用>/resources/res/`。文字一般在 `values/strings.xml`，应用还可能在 `values-en-rUS/` 等目录提供本地化版本。 |
| 组件和应用清单 | `sources/<应用>/resources/AndroidManifest.xml`。由 Apktool 单独提取的 SDK 及版本信息在同目录的 `apktool.yml`。 |
| 随包文件与本机库 | 各应用实际拥有的 `android/<应用>/assets/`、`lib/` 和 `unknown/`。 |

构建需要 Bash、Python 3、JDK 21、Android SDK Build Tools 35.0.0 及项目随附的 Apktool。首次运行 Gradle Wrapper 需要可用的发行包或网络。在项目根目录执行以下命令。

```sh
# JAVA_HOME 和 ANDROID_HOME 分别指向本机的 JDK 和 Android SDK
cd android
./gradlew assembleDebug
# 单独重建问卷调查
./gradlew ':问卷调查:assembleDebug'
```

Gradle 先汇编 smali。脚本将解码后的资源与原包解码时的 SHA-256 对照。原样构建直接打包原编译资源，编辑过的清单、资源或资源元数据会触发 AAPT2 编译，再与该次构建的 DEX、assets 和本机库一起对齐、签名。要核对原样构建，可从项目根目录运行 `python3 tools/verification/verify_apks.py`。该命令比较原包的内容，仅用于未修改的工程。[资源构建脚本](tools/build_resources.py)

在隔离副本里修改了 11 个应用的本地化名称，执行同一条 Gradle 构建命令，Android 11 的资源加载器从每个已安装 APK 读回了新名称。问卷调查额外新增一个字符串，让现有布局中的 TextView 和清单中的 Activity 标题引用它。实际可见的文字是 `Local resource build verified`。11 个应用共有 86,490 个原始资源 ID，重编后逐项对应；测试从设备取回 APK，核对了包含 36 个 DEX 在内的 2,151 个非资源、非签名成员的 SHA-256 和压缩方式。问卷调查的无效 XML 会使 Gradle 构建失败，上一次成功签名的 APK 仍可用，撤回编辑后 804 个资源成员恢复为原包字节。[逐应用验证](reports/evidence/resource-build.json) · [模拟器原生界面](reports/evidence/resource-edit-screen.png) · [REA 对照读取的字符串](reports/evidence/resource-rea.json)

可按各应用报告中的 `resource-files.json` 查找原始短文件名。11 个包共映射 14,830 个文件资源配置，其中 12,292 个原包路径与可编辑路径不同，包括缩短的名称和编译器对目录限定符的处理。比如错题本 `res/RF.xml` 对应 `layout/activity_legacy_mistake`，ID 是 `0x7f0c001c`。在 111 个清单声明的 Activity 中，121 处直接加载布局的指令旁已标出这些对应关系。[错题本文件映射](reports/apps/错题本/resource-files.json) · [引用位置](android/错题本/smali_classes3/com/zykj/mistake/activity/LegacyMistakeActivity.smali#L64) · [可编辑布局](sources/错题本/resources/res/layout/activity_legacy_mistake.xml)

另在空 DEX 缓存下从带注释的 smali 重新汇编全部 11 个应用。包含 36 个 DEX 在内的 17,003 个非签名文件均与已交付的原样构建逐字节一致。[清缓存重建核对](reports/evidence/resource-clean-build.json)

[Gradle 构建日志](reports/evidence/gradle-build.log)记录了 11 个子项目构建成功。另在全新构建目录里并行编译选课和问卷调查，两包均通过签名校验并使用同一个新建的调试证书。[并行首编记录](reports/evidence/fresh-parallel-build.txt) · [逐 APK 核对](reports/evidence/build-verification.json)列出签名验证、各 DEX 的类名集合，以及排除签名和 DEX 后所有 ZIP 成员的差异。调试签名与原厂签名不同。在支持 ARM 转译的 Google APIs Android 11 模拟器，11 份重建包均安装成功并能启动。用最终产物重新安装和启动，设备读回的 11 份 APK 的 SHA-256 均与交付文件一致。九个教学应用进入未登录提示页，中育管控桌面和领创平板管理分别进入 MainActivity 和 LauncherNew，全程未使用教学账户。AOSP 纯 x86 镜像上的兼容差异另列。完整教学流程及设备管理功能仍需配套环境。[11 个包的安装和启动记录](reports/evidence/emulator-compat.json) · [纯 x86 镜像对照](reports/evidence/emulator-smoke.json) · [Android 官方 ARM 转译说明](https://android-developers.googleblog.com/2020/03/run-arm-apps-on-android-emulator.html)

7 个应用另有和当前重编 APK 配套的 Android 11 性能配置。原始 APK 的 31 个 DEX 校验值在重新汇编后均有变化。Android SDK 对原件和更新后的配置解出了相同的 263,725 条类及方法规则（逐应用合计），Android 11 上这 7 组 APK 与 DM 一起安装后，系统均记录了 `speed-profile` 和 `install-dm`。每个 DM 绑定一份 APK，逐包记录中含两者的 SHA-256。可从仓库根目录用下面的命令安装错题本和匹配的配置。[7 份 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [逐包核对](reports/evidence/art-profiles.json) · [文件结构](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#android-的启动性能配置)

```sh
adb install-multiple -r dist/错题本.apk dist/dex-metadata/android-11/错题本.dm
```

11 个原 APK 在 `assets/` 下共带有 59 个文件，已逐一核对编译工程副本。城市选择器、天气地点和图片分类模型的文件结构见存储报告。[完整随包资产表](reports/evidence/packaged-assets.json) · [两份城市表及原包核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#随包资产和管控桌面的两份城市表) · [云笔记模型](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记的图片分类模型)

优课畅学随包的 TBS 内核还包含三份 Chromium 资源包。可以按 ID 读取其中的中文、图片、声音和网页资源。音频历史库的 14 个字段及旧记录升级行为已在 Android 11 核对。[资源格式、读取示例和音频历史库](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#优课畅学的-tbs-资源和音频历史库)

云笔记和优课畅学的 PDF 阅读进度可用 `tools/read-data.py --type pdf-progress` 查看。两款都使用完整的本地文件路径区分文档，保存的页索引从零开始。[两种数据库、原包翻页验证与样本](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记和优课畅学的-pdf-阅读进度)

下载缓存另有三种 SQLite 格式。随身答内置 Room 下载库和 OkDownload 分段库，两套实现均已验证。领创的 FileDownloader 保存绝对文件偏移。可用 `tools/read-data.py` 查看各原包生成的样本，并对照超过 4 GiB 的断点在磁盘和原应用内存中的实际数值。[三种格式、样本和解码命令](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

## 按应用查看

每份报告包含清单组件、业务类及方法、全部 DEX 包索引、持久化调用、原生库与 ABI 和名称恢复线索。JADX 的错误数是反编译日志统计；涉及的方法可在编译工程中查看完整指令。R8 删除的名称仅在调试元数据或其他版本提供证据时给出候选。

每份报告还提供「Java 占位行与原 DEX 指令对照」。11 个应用的 Java 阅读源中，仍有 13,124 处保留 JADX 的方法体占位，每一处都可以点到 smali 实现。按应用分别去重，对应 13,117 个方法；已从原 APK 的 DEX 方法表和代码段逐个核对。1,140 处位于可识别的业务命名空间，Java 占位行本身也标有指令位置。[逐应用数量和原包校验](reports/evidence/java-fallbacks.json) · [错题本的方法对照](reports/apps/错题本/java-fallbacks.md)

| 应用报告 | Android 包名 | 版本 | DEX 类数 | JADX 错误数 |
|---|---|---|---:|---:|
| [中育云笔记](reports/apps/中育云笔记/README.md) | `com.friday.cloudsnote` | 1.13.5 | 44,769 | 104 |
| [中育管控桌面](reports/apps/中育管控桌面/README.md) | `com.zykj.manage` | 1.0.34 | 39,191 | 47 |
| [优课畅学](reports/apps/优课畅学/README.md) | `com.zhongyukejiao.learningexpert` | 1.1.3 | 42,885 | 84 |
| [在线专栏](reports/apps/在线专栏/README.md) | `com.zykj.subscriber` | 1.3.4 | 8,945 | 4 |
| [新测评](reports/apps/新测评/README.md) | `com.zykj.evaluation` | 2.4.8 | 43,215 | 75 |
| [网阅联考](reports/apps/网阅联考/README.md) | `com.zykj.insight` | 1.0.0 | 15,770 | 37 |
| [选课](reports/apps/选课/README.md) | `com.zykj.curricula` | 1.0.8 | 2,397 | 0 |
| [错题本](reports/apps/错题本/README.md) | `com.zykj.mistake` | 1.2.5 | 23,001 | 73 |
| [问卷调查](reports/apps/问卷调查/README.md) | `com.zykj.satisfaction` | 1.0.5 | 1,837 | 7 |
| [随身答](reports/apps/随身答/README.md) | `com.zykj.student.dialogue` | 1.1.4 | 43,967 | 77 |
| [领创平板管理-2025.9.1](https://github.com/Loshop-Studio/linspirer-android-reverse/blob/main/reports/apps/%E9%A2%86%E5%88%9B%E5%B9%B3%E6%9D%BF%E7%AE%A1%E7%90%86-2025.9.1/README.md) | `com.android.launcher3` | zhongyukejiao_hem_6.10.004.6 | 6,137 | 34 |

## 分析依据

REA 6.9.0 的静态产物检查覆盖每个原 APK，证据绑定输入 SHA-256；每包还通过 REA 方法检查核对了一个入口方法，错题本另核对了原生简笔板写入入口。JADX 1.5.3 生成 Java 与名称映射，Apktool 3.0.2 生成参与构建的 smali。模块报告中的读写行为来自 DEX 调用、协议定义及数据库模型，跨版本候选映射另列。账号密码及文档访问令牌均未写入工程。[REA 项目](https://github.com/morluto/rea) · [11 份 REA 检查记录](reports/evidence/rea/) · [附带 HTML 与 Python 文件](reports/附带文件.md) · [写入方法证据](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/rea-saveListToFile.json)
