.class public final synthetic Ln6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;ZZZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/c;->a:Landroidx/navigation/NavController;

    iput-boolean p2, p0, Ln6/c;->b:Z

    iput-boolean p3, p0, Ln6/c;->c:Z

    iput-boolean p4, p0, Ln6/c;->d:Z

    iput p5, p0, Ln6/c;->e:I

    iput p6, p0, Ln6/c;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Ln6/c;->a:Landroidx/navigation/NavController;

    iget-boolean v1, p0, Ln6/c;->b:Z

    iget-boolean v2, p0, Ln6/c;->c:Z

    iget-boolean v3, p0, Ln6/c;->d:Z

    iget v4, p0, Ln6/c;->e:I

    iget v5, p0, Ln6/c;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Ln6/d;->a(Landroidx/navigation/NavController;ZZZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
