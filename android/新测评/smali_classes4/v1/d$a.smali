.class public Lv1/d$a;
.super Lv1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lv1/d;-><init>(Lw1/d;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lv1/d;->q(Ljava/io/IOException;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
