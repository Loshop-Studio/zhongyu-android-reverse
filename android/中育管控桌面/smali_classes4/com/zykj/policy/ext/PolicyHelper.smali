.class public abstract Lcom/zykj/policy/ext/PolicyHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/policy/ext/PolicyHelper$a;,
        Lcom/zykj/policy/ext/PolicyHelper$Builder;
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/policy/ext/PolicyHelper$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/policy/ext/PolicyHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/policy/ext/PolicyHelper;->a:Lcom/zykj/policy/ext/PolicyHelper$a;

    return-void
.end method
