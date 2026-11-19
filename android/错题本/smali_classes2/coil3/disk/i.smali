.class public final Lcoil3/disk/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Lcoil3/disk/d;


# direct methods
.method public constructor <init>(Lcoil3/disk/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/disk/i;->a:Lcoil3/disk/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/disk/d;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
