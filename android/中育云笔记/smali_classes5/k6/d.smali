.class public Lk6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# instance fields
.field public final a:Landroid/media/MediaScannerConnection;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lk6/d;->b:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p2, Landroid/media/MediaScannerConnection;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p2, p1, p0}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lk6/d;->a:Landroid/media/MediaScannerConnection;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/media/MediaScannerConnection;->connect()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public onMediaScannerConnected()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk6/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk6/d;->a:Landroid/media/MediaScannerConnection;

    .line 10
    .line 11
    iget-object v1, p0, Lk6/d;->b:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk6/d;->a:Landroid/media/MediaScannerConnection;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
