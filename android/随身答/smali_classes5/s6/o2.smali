.class public final synthetic Ls6/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Long;

.field public final synthetic e:Ls6/k0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ls6/k0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/o2;->a:Ljava/lang/String;

    iput-object p2, p0, Ls6/o2;->b:Ljava/lang/String;

    iput-object p3, p0, Ls6/o2;->c:Ljava/lang/String;

    iput-object p4, p0, Ls6/o2;->d:Ljava/lang/Long;

    iput-object p5, p0, Ls6/o2;->e:Ls6/k0;

    iput-object p6, p0, Ls6/o2;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ls6/o2;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ls6/o2;->h:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Ls6/o2;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Ls6/o2;->a:Ljava/lang/String;

    iget-object v1, p0, Ls6/o2;->b:Ljava/lang/String;

    iget-object v2, p0, Ls6/o2;->c:Ljava/lang/String;

    iget-object v3, p0, Ls6/o2;->d:Ljava/lang/Long;

    iget-object v4, p0, Ls6/o2;->e:Ls6/k0;

    iget-object v5, p0, Ls6/o2;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ls6/o2;->g:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Ls6/o2;->h:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Ls6/o2;->i:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ls6/k0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
