.class public final synthetic Lb7/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/Lifecycle$Event;

.field public final synthetic b:Lb7/l;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/f0;->a:Landroidx/lifecycle/Lifecycle$Event;

    iput-object p2, p0, Lb7/f0;->b:Lb7/l;

    iput-object p3, p0, Lb7/f0;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/f0;->a:Landroidx/lifecycle/Lifecycle$Event;

    iget-object v1, p0, Lb7/f0;->b:Lb7/l;

    iget-object v2, p0, Lb7/f0;->c:Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->a(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
