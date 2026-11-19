.class public final synthetic Lx6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/i;->a:Ljava/lang/String;

    iput-object p2, p0, Lx6/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lx6/i;->c:Landroidx/navigation/NavHostController;

    iput-object p4, p0, Lx6/i;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lx6/i;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lx6/i;->a:Ljava/lang/String;

    iget-object v1, p0, Lx6/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lx6/i;->c:Landroidx/navigation/NavHostController;

    iget-object v3, p0, Lx6/i;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lx6/i;->e:Lkotlin/jvm/functions/Function0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lx6/m;->e(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
