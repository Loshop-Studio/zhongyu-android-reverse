.class public final Lcom/friday/common/entity/EventBusKey;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/EventBusKey$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/friday/common/entity/EventBusKey$Companion;

.field public static final KEY_CLASS_BITMAP:Ljava/lang/String; = "key_class_bitmap"

.field public static final KEY_CURRENT_CLASS_STATE:Ljava/lang/String; = "key_current_class_state"

.field public static final KEY_SAVE_SHARE_LIST:Ljava/lang/String; = "key_save_share_list"

.field public static final KEY_SHARE_CURRENT_PAGE:Ljava/lang/String; = "key_share_current_page"

.field public static final KEY_START_SCREEN_CAPTURE:Ljava/lang/String; = "key_screen_capture"

.field public static final PAUSE_RECORD_SERVICE:Ljava/lang/String; = "pause_record_service"

.field public static final RESTART_RECORD_SERVICE:Ljava/lang/String; = "restart_record_service"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/entity/EventBusKey$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/entity/EventBusKey$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/entity/EventBusKey;->Companion:Lcom/friday/common/entity/EventBusKey$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
