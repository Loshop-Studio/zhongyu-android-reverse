.class public Ll0/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d(Ll0/r;)Ll0/n;
    .locals 3

    .line 1
    new-instance v0, Ll0/y;

    .line 2
    .line 3
    const-class v1, Ll0/h;

    .line 4
    .line 5
    const-class v2, Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, Ll0/r;->d(Ljava/lang/Class;Ljava/lang/Class;)Ll0/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ll0/y;-><init>(Ll0/n;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
