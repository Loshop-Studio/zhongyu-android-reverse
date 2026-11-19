.class public Lcom/stormdzh/lame4android/Lame;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "mp3lame"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static native close()V
.end method

.method public static native encode([S[SI[B)I
.end method

.method public static native encodeFile(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native flush([B)I
.end method

.method public static native getLameVersion()Ljava/lang/String;
.end method

.method public static native init(IIIII)V
.end method

.method public static native setRawBigEndian(Z)V
.end method
