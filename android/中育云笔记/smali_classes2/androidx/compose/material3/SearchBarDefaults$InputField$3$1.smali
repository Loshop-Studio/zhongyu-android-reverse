.class final Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SearchBarDefaults;->InputField(Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $onSearch:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $query:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lhd/l;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;->$onSearch:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;->$query:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/KeyboardActionScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;->invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/KeyboardActionScope;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;->$onSearch:Lhd/l;

    iget-object v0, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;->$query:Ljava/lang/String;

    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
