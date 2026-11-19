.class public final Lcom/shuyu/gsyvideoplayer/R$styleable;
.super Ljava/lang/Object;


# static fields
.field public static download:[I = null

.field public static download_download_bg_line_color:I = 0x0

.field public static download_download_bg_line_width:I = 0x1

.field public static download_download_line_color:I = 0x2

.field public static download_download_line_width:I = 0x3

.field public static download_download_text_color:I = 0x4

.field public static download_download_text_size:I = 0x5

.field public static play:[I = null

.field public static play_play_bg_line_color:I = 0x0

.field public static play_play_bg_line_width:I = 0x1

.field public static play_play_line_color:I = 0x2

.field public static play_play_line_width:I = 0x3


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shuyu/gsyvideoplayer/R$styleable;->download:[I

    const v0, 0x7f0405f3

    const v1, 0x7f0405f4

    const v2, 0x7f0405f1

    const v3, 0x7f0405f2

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/shuyu/gsyvideoplayer/R$styleable;->play:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0402cd
        0x7f0402ce
        0x7f0402cf
        0x7f0402d0
        0x7f0402d1
        0x7f0402d2
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
