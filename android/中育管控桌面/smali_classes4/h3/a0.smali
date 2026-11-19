.class public final synthetic Lh3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/a0;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lh3/a0;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh3/a0;->a:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lh3/a0;->b:Lkotlin/jvm/functions/Function0;

    check-cast p1, Lcoil3/compose/AsyncImagePainter$c;

    invoke-static {v0, v1, p1}, Lh3/b0;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcoil3/compose/AsyncImagePainter$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
