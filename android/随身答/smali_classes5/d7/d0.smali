.class public final synthetic Ld7/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/d0;->a:Ljava/io/File;

    iput-object p2, p0, Ld7/d0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ld7/d0;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/d0;->a:Ljava/io/File;

    iget-object v1, p0, Ld7/d0;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ld7/d0;->c:Lkotlin/jvm/functions/Function0;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$d;->b(Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
