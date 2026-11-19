.class public final synthetic Lm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcoil3/disk/DiskLruCache;


# direct methods
.method public synthetic constructor <init>(Lcoil3/disk/DiskLruCache;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/a;->c:Lcoil3/disk/DiskLruCache;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a;->c:Lcoil3/disk/DiskLruCache;

    check-cast p1, Ljava/io/IOException;

    invoke-static {v0, p1}, Lcoil3/disk/DiskLruCache;->a(Lcoil3/disk/DiskLruCache;Ljava/io/IOException;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
