.class public Lr/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lq/q;)Lq/m;
    .locals 3

    .line 1
    new-instance v0, Lr/b;

    .line 2
    .line 3
    const-class v1, Lq/g;

    .line 4
    .line 5
    const-class v2, Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, Lq/q;->d(Ljava/lang/Class;Ljava/lang/Class;)Lq/m;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Lr/b;-><init>(Lq/m;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
