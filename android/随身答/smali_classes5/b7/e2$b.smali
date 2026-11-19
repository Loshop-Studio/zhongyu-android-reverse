.class public final Lb7/e2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb7/e2;->b(Ld5/k;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Ld5/k;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ld5/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/e2$b;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, Lb7/e2$b;->b:Ld5/k;

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
    iget-object v0, p0, Lb7/e2$b;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lb7/e2$b;->b:Ld5/k;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Ld5/k;->h(Ls5/b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
