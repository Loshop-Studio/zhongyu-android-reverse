.class public final synthetic Le7/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/focus/FocusManager;

.field public final synthetic b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/g0;->a:Landroidx/compose/ui/focus/FocusManager;

    iput-object p2, p0, Le7/g0;->b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p3, p0, Le7/g0;->c:Ljava/lang/String;

    iput-object p4, p0, Le7/g0;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Le7/g0;->a:Landroidx/compose/ui/focus/FocusManager;

    iget-object v1, p0, Le7/g0;->b:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v2, p0, Le7/g0;->c:Ljava/lang/String;

    iget-object v3, p0, Le7/g0;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-static {v0, v1, v2, v3, p1}, Le7/k0;->f(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
