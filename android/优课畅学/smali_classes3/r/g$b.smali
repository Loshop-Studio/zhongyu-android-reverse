.class public Lr/g$b;
.super Lr/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lr/g$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lr/g$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lr/g$a;-><init>(Lr/g$d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
