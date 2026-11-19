.class public final synthetic Lz6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lz6/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lz6/b;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lz6/b;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lz6/b;->e:Ljava/lang/String;

    iput-object p6, p0, Lz6/b;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lz6/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lz6/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lz6/b;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lz6/b;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lz6/b;->e:Ljava/lang/String;

    iget-object v5, p0, Lz6/b;->f:Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lz6/d;->a(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
