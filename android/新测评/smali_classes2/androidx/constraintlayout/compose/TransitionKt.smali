.class public final Landroidx/constraintlayout/compose/TransitionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "Transition",
        "Landroidx/constraintlayout/compose/Transition;",
        "content",
        "",
        "constraintlayout-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/constraintlayout/compose/TransitionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"
    }
.end annotation


# direct methods
.method public static final Transition(Ljava/lang/String;)Landroidx/constraintlayout/compose/Transition;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ComposableNaming"
        }
    .end annotation

    .annotation build Landroidx/constraintlayout/compose/ExperimentalMotionApi;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/constraintlayout/core/parser/CLParser;->parse(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Landroidx/constraintlayout/core/parser/CLParsingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    goto :goto_0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "Error parsing JSON "

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "CML"

    .line 25
    .line 26
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    :goto_0
    if-eqz p0, :cond_0

    .line 31
    .line 32
    new-instance v0, Landroidx/constraintlayout/compose/TransitionImpl;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Landroidx/constraintlayout/compose/TransitionImpl;-><init>(Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    sget-object p0, Landroidx/constraintlayout/compose/TransitionImpl;->Companion:Landroidx/constraintlayout/compose/TransitionImpl$Companion;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/TransitionImpl$Companion;->getEMPTY$constraintlayout_compose_release()Landroidx/constraintlayout/compose/TransitionImpl;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_1
    return-object v0
.end method
