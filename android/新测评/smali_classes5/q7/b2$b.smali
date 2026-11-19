.class public final Lq7/b2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/b2;->b(Ln4/i;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Ln4/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ln4/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq7/b2$b;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, Lq7/b2$b;->b:Ln4/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq7/b2$b;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lq7/b2$b;->b:Ln4/i;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Ln4/i;->B(Lc5/b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
