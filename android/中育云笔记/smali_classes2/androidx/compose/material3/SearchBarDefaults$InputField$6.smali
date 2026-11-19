.class final Landroidx/compose/material3/SearchBarDefaults$InputField$6;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


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
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $colors:Landroidx/compose/material3/TextFieldColors;

.field final synthetic $enabled:Z

.field final synthetic $expanded:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $leadingIcon:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onExpandedChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onQueryChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onSearch:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $query:Ljava/lang/String;

.field final synthetic $tmp7_rcvr:Landroidx/compose/material3/SearchBarDefaults;

.field final synthetic $trailingIcon:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/material3/SearchBarDefaults;Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SearchBarDefaults;",
            "Ljava/lang/String;",
            "Lhd/l;",
            "Lhd/l;",
            "Z",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/p;",
            "Landroidx/compose/material3/TextFieldColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "III)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$tmp7_rcvr:Landroidx/compose/material3/SearchBarDefaults;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$query:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onQueryChange:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onSearch:Lhd/l;

    .line 8
    .line 9
    iput-boolean p5, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$expanded:Z

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onExpandedChange:Lhd/l;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$modifier:Landroidx/compose/ui/Modifier;

    .line 14
    .line 15
    iput-boolean p8, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$enabled:Z

    .line 16
    .line 17
    iput-object p9, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$placeholder:Lhd/p;

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$leadingIcon:Lhd/p;

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$trailingIcon:Lhd/p;

    .line 22
    .line 23
    iput-object p12, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$colors:Landroidx/compose/material3/TextFieldColors;

    .line 24
    .line 25
    iput-object p13, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 26
    .line 27
    iput p14, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$changed:I

    .line 28
    .line 29
    iput p15, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$changed1:I

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput p1, p0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$default:I

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$tmp7_rcvr:Landroidx/compose/material3/SearchBarDefaults;

    iget-object v2, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$query:Ljava/lang/String;

    iget-object v3, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onQueryChange:Lhd/l;

    iget-object v4, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onSearch:Lhd/l;

    iget-boolean v5, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$expanded:Z

    iget-object v6, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$onExpandedChange:Lhd/l;

    iget-object v7, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v8, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$enabled:Z

    iget-object v9, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$placeholder:Lhd/p;

    iget-object v10, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$leadingIcon:Lhd/p;

    iget-object v11, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$trailingIcon:Lhd/p;

    iget-object v12, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$colors:Landroidx/compose/material3/TextFieldColors;

    iget-object v13, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget v14, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$changed:I

    or-int/lit8 v14, v14, 0x1

    invoke-static {v14}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    iget v14, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$changed1:I

    invoke-static {v14}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v14, v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;->$$default:I

    move/from16 v17, v14

    move-object/from16 v14, p1

    invoke-virtual/range {v1 .. v17}, Landroidx/compose/material3/SearchBarDefaults;->InputField(Ljava/lang/String;Lhd/l;Lhd/l;ZLhd/l;Landroidx/compose/ui/Modifier;ZLhd/p;Lhd/p;Lhd/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
