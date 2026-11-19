.class public abstract synthetic Lcom/zykj/blackboard/core/action/GeometryAction$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/GeometryAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->values()[Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->c:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->d:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->e:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sput-object v0, Lcom/zykj/blackboard/core/action/GeometryAction$a;->a:[I

    return-void
.end method
