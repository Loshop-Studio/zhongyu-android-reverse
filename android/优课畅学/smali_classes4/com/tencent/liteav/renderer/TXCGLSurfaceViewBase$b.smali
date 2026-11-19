.class Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;
.super Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:I

.field final synthetic i:Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;

.field private j:[I


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;IIIIII)V
    .locals 13

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->i:Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;

    .line 2
    .line 3
    const/16 v10, 0x3026

    .line 4
    .line 5
    const/16 v12, 0x3038

    .line 6
    .line 7
    const/16 v0, 0x3024

    .line 8
    .line 9
    const/16 v2, 0x3023

    .line 10
    .line 11
    const/16 v4, 0x3022

    .line 12
    .line 13
    const/16 v6, 0x3021

    .line 14
    .line 15
    const/16 v8, 0x3025

    .line 16
    .line 17
    move v1, p2

    .line 18
    move/from16 v3, p3

    .line 19
    .line 20
    move/from16 v5, p4

    .line 21
    .line 22
    move/from16 v7, p5

    .line 23
    .line 24
    move/from16 v9, p6

    .line 25
    .line 26
    move/from16 v11, p7

    .line 27
    .line 28
    filled-new-array/range {v0 .. v12}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, p1, v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$a;-><init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;[I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    new-array p1, p1, [I

    .line 37
    .line 38
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->j:[I

    .line 39
    .line 40
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->c:I

    .line 41
    .line 42
    iput v3, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->d:I

    .line 43
    .line 44
    iput v5, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->e:I

    .line 45
    .line 46
    iput v7, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->f:I

    .line 47
    .line 48
    iput v9, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->g:I

    .line 49
    .line 50
    iput v11, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->h:I

    .line 51
    .line 52
    return-void
.end method

.method private a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->j:[I

    invoke-interface {p1, p2, p3, p4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 11
    iget-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->j:[I

    const/4 p2, 0x0

    aget p1, p1, p2

    return p1

    :cond_0
    return p5
.end method


# virtual methods
.method public a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 9

    .line 1
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v5, p3, v1

    const/16 v6, 0x3025

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    .line 2
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result p1

    const/16 v6, 0x3026

    .line 3
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result p2

    .line 4
    iget v6, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->g:I

    if-lt p1, v6, :cond_0

    iget p1, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->h:I

    if-lt p2, p1, :cond_0

    const/16 v6, 0x3024

    const/4 v7, 0x0

    .line 5
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result p1

    const/16 v6, 0x3023

    move-object v2, p0

    .line 6
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result p2

    const/16 v6, 0x3022

    .line 7
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v8

    const/16 v6, 0x3021

    .line 8
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->a(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I

    move-result v6

    .line 9
    iget v7, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->c:I

    if-ne p1, v7, :cond_0

    iget p1, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->d:I

    if-ne p2, p1, :cond_0

    iget p1, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->e:I

    if-ne v8, p1, :cond_0

    iget p1, v2, Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$b;->f:I

    if-ne v6, p1, :cond_0

    return-object v5

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move-object p1, v3

    move-object p2, v4

    goto :goto_0

    :cond_1
    move-object v2, p0

    const/4 p1, 0x0

    return-object p1
.end method
