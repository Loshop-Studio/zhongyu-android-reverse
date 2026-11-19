.class public final synthetic Lk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lp/k$a;

.field public final synthetic b:Lkotlin/reflect/KClass;


# direct methods
.method public synthetic constructor <init>(Lp/k$a;Lkotlin/reflect/KClass;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/f;->a:Lp/k$a;

    iput-object p2, p0, Lk/f;->b:Lkotlin/reflect/KClass;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk/f;->a:Lp/k$a;

    iget-object v1, p0, Lk/f;->b:Lkotlin/reflect/KClass;

    invoke-static {v0, v1}, Lcoil3/a$a;->d(Lp/k$a;Lkotlin/reflect/KClass;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
