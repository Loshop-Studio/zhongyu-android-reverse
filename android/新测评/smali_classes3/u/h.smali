.class public final synthetic Lu/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcoil3/e;


# direct methods
.method public synthetic constructor <init>(Lcoil3/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/h;->a:Lcoil3/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/h;->a:Lcoil3/e;

    invoke-static {v0}, Lcoil3/network/NetworkFetcher$Factory;->c(Lcoil3/e;)Lcoil3/disk/a;

    move-result-object v0

    return-object v0
.end method
