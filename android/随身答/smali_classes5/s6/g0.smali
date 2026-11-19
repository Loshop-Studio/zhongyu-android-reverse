.class public final synthetic Ls6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Integer;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/g0;->a:Ljava/lang/String;

    iput-object p2, p0, Ls6/g0;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Ls6/g0;->c:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Ls6/g0;->d:Z

    iput-object p5, p0, Ls6/g0;->e:Ljava/lang/Integer;

    iput p6, p0, Ls6/g0;->f:I

    iput p7, p0, Ls6/g0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Ls6/g0;->a:Ljava/lang/String;

    iget-object v1, p0, Ls6/g0;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Ls6/g0;->c:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Ls6/g0;->d:Z

    iget-object v4, p0, Ls6/g0;->e:Ljava/lang/Integer;

    iget v5, p0, Ls6/g0;->f:I

    iget v6, p0, Ls6/g0;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Ls6/j0;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
