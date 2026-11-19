.class public final synthetic Lg6/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/c;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Lkotlin/jvm/functions/Function3;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/evaluation/ui/detail/c;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg6/b0;->a:Z

    iput-object p2, p0, Lg6/b0;->b:Lcom/zykj/evaluation/ui/detail/c;

    iput-object p3, p0, Lg6/b0;->c:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lg6/b0;->d:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lg6/b0;->e:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lg6/b0;->a:Z

    iget-object v1, p0, Lg6/b0;->b:Lcom/zykj/evaluation/ui/detail/c;

    iget-object v2, p0, Lg6/b0;->c:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lg6/b0;->d:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lg6/b0;->e:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, v2, v3, v4}, Lg6/z0;->w(ZLcom/zykj/evaluation/ui/detail/c;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
