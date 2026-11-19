.class public Ln0/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
.method public c(Ln0/r;)Ln0/n;
    .locals 3

    .line 1
    new-instance v0, Ln0/v;

    .line 2
    .line 3
    const-class v1, Landroid/net/Uri;

    .line 4
    .line 5
    const-class v2, Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, Ln0/r;->d(Ljava/lang/Class;Ljava/lang/Class;)Ln0/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ln0/v;-><init>(Ln0/n;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
