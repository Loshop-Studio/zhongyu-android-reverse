.class public final synthetic Lk/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcoil3/e$a;


# direct methods
.method public synthetic constructor <init>(Lcoil3/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/m;->a:Lcoil3/e$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/m;->a:Lcoil3/e$a;

    invoke-static {v0}, Lcoil3/e$a;->b(Lcoil3/e$a;)Lt/d;

    move-result-object v0

    return-object v0
.end method
