# RE note 本类字节码直接引用的读写或显示接口包括JSON、文件流。
.class public Lcom/zykj/subscriber/update/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/update/c$c;,
        Lcom/zykj/subscriber/update/c$f;,
        Lcom/zykj/subscriber/update/c$e;,
        Lcom/zykj/subscriber/update/c$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/app/Dialog;

.field private c:Landroid/app/ProgressDialog;

.field private d:Lcom/zykj/subscriber/update/c$f;

.field private e:Lcom/zykj/subscriber/update/c$c;

.field private f:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lcom/zykj/subscriber/update/c;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/subscriber/update/c;->o(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/zykj/subscriber/update/c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/zykj/subscriber/update/c;->n(Z)V

    return-void
.end method

.method static synthetic c(Lcom/zykj/subscriber/update/c;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic d(Lcom/zykj/subscriber/update/c;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/zykj/subscriber/update/c;->i(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic e(Lcom/zykj/subscriber/update/c;)Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/update/c;->f:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    return-object p0
.end method

.method static synthetic f(Lcom/zykj/subscriber/update/c;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    return-object p0
.end method

.method static synthetic g(Lcom/zykj/subscriber/update/c;)Lcom/zykj/subscriber/update/c$c;
    .locals 0

    iget-object p0, p0, Lcom/zykj/subscriber/update/c;->e:Lcom/zykj/subscriber/update/c$c;

    return-object p0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method private i(Ljava/lang/String;I)V
    .locals 6

    const/4 v0, 0x1

    .line 1
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const/16 v2, 0x400

    new-array v2, v2, [B

    .line 5
    :goto_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    .line 6
    new-instance v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5, v3}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p1, "UpdateVersionManager"

    .line 7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/zykj/subscriber/update/UpdateResp;

    invoke-virtual {p1, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/subscriber/update/UpdateResp;

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/zykj/subscriber/update/UpdateResp;->getResult()Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/zykj/subscriber/update/UpdateResp;->getResult()Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/update/c;->f:Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;->getVersionCode()I

    move-result p1

    if-le p1, p2, :cond_1

    .line 12
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->d:Lcom/zykj/subscriber/update/c$f;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->d:Lcom/zykj/subscriber/update/c$f;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->d:Lcom/zykj/subscriber/update/c$f;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 15
    iget-object p2, p0, Lcom/zykj/subscriber/update/c;->d:Lcom/zykj/subscriber/update/c$f;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private j(ZII)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lh2/a;->a:Lh2/a;

    invoke-virtual {v1}, Lh2/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/api/services/app/AppStore/CheckUpdateAsync?packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "com.zykj.subscriber"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&appType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const v0, 0x7f0f00a9

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const v2, 0x7f0f00a7

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/update/c;->c:Landroid/app/ProgressDialog;

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 5
    :cond_0
    new-instance p1, Lcom/zykj/subscriber/update/c$f;

    new-instance v0, Lcom/zykj/subscriber/update/b;

    invoke-direct {v0, p0}, Lcom/zykj/subscriber/update/b;-><init>(Lcom/zykj/subscriber/update/c;)V

    invoke-direct {p1, v0}, Lcom/zykj/subscriber/update/c$f;-><init>(Lcom/zykj/subscriber/update/c$e;)V

    iput-object p1, p0, Lcom/zykj/subscriber/update/c;->d:Lcom/zykj/subscriber/update/c$f;

    .line 6
    new-instance p1, Lcom/zykj/subscriber/update/c$a;

    invoke-direct {p1, p0, p2, p3}, Lcom/zykj/subscriber/update/c$a;-><init>(Lcom/zykj/subscriber/update/c;Ljava/lang/String;I)V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private k()V
    .locals 4

    .line 1
    new-instance v0, Landroid/app/Dialog;

    iget-object v1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const v2, 0x103000b

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 3
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    const v1, 0x7f0c0030

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 4
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 5
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 6
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    const v2, 0x7f0901a6

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/zykj/subscriber/update/PercentCircleView;

    .line 7
    new-instance v2, Lcom/zykj/subscriber/update/c$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/zykj/subscriber/update/a;

    invoke-direct {v3, v0}, Lcom/zykj/subscriber/update/a;-><init>(Lcom/zykj/subscriber/update/PercentCircleView;)V

    invoke-direct {v2, p0, v3}, Lcom/zykj/subscriber/update/c$c;-><init>(Lcom/zykj/subscriber/update/c;Lcom/zykj/subscriber/update/c$d;)V

    iput-object v2, p0, Lcom/zykj/subscriber/update/c;->e:Lcom/zykj/subscriber/update/c$c;

    .line 8
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    new-instance v2, Lk2/a;

    invoke-direct {v2, p0}, Lk2/a;-><init>(Lcom/zykj/subscriber/update/c;)V

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 9
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const v2, 0x7f0f0094

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 12
    new-instance v0, Lcom/zykj/subscriber/update/c$b;

    invoke-direct {v0, p0}, Lcom/zykj/subscriber/update/c$b;-><init>(Lcom/zykj/subscriber/update/c;)V

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_0
    return-void
.end method

.method private synthetic n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->c:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/zykj/subscriber/update/c;->c:Landroid/app/ProgressDialog;

    :cond_0
    if-eqz p1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/zykj/subscriber/update/c;->k()V

    :cond_1
    return-void
.end method

.method private synthetic o(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p2

    if-nez p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const p3, 0x7f0f0034

    invoke-static {p2, p3, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, 0x1

    :cond_0
    return p1
.end method


# virtual methods
.method public h(ZII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    invoke-static {v0}, Ll2/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/subscriber/update/c;->j(ZII)V

    return-void
.end method

.method public l(Ljava/lang/String;)Ljava/io/File;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 v0, 0x1388

    .line 4
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 5
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    if-lez v0, :cond_0

    .line 6
    iget-object v1, p0, Lcom/zykj/subscriber/update/c;->e:Lcom/zykj/subscriber/update/c$c;

    const/4 v2, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 8
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "/install.apk"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 11
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v3, 0x400

    new-array v3, v3, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 13
    :goto_0
    invoke-virtual {v2, v3}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_2

    add-int/2addr v5, v6

    .line 14
    invoke-virtual {v1, v3, v4, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 15
    iget-object v6, p0, Lcom/zykj/subscriber/update/c;->e:Lcom/zykj/subscriber/update/c$c;

    const/4 v7, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v7, v8}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V

    .line 17
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 19
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method protected m(Ljava/io/File;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    const-string v2, "com.zykj.subscriber.fileProvider"

    invoke-static {v1, v2, p1}, Landroidx/core/content/FileProvider;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    const-string v1, "application/vnd.android.package-archive"

    .line 5
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const p1, 0x10000003

    .line 6
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string p1, "android.intent.action.VIEW"

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object p1, p0, Lcom/zykj/subscriber/update/c;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 9
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return-void
.end method
