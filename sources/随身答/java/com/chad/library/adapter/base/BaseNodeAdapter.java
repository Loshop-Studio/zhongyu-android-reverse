package com.chad.library.adapter.base;

import androidx.annotation.IntRange;
import androidx.compose.material3.MenuKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.entity.node.NodeFooterImp;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J2\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J<\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J2\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J2\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J<\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J2\u0010!\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007JR\u0010\"\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001cH\u0007J2\u0010'\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u000e\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0002J\u0010\u0010(\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bJ-\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\bH\u0014J\u0016\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u001e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002J$\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ\u0016\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002J\u0016\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\bJ\u001c\u00105\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ\u001e\u00106\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002J\u0010\u00107\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0010\u00109\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0018\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001e\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\"\u0010<\u001a\u00020\u000b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010A\u001a\u00020\u000b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0016J\u0018\u0010B\u001a\u00020\u000b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m13413d2 = {"Lcom/chad/library/adapter/base/BaseNodeAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "nodeList", "", "(Ljava/util/List;)V", "fullSpanNodeTypeSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "addData", "", "data", RequestParameters.POSITION, "newData", "", "addFooterNodeProvider", "provider", "Lcom/chad/library/adapter/base/provider/BaseNodeProvider;", "addFullSpanNodeProvider", "addItemProvider", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "addNodeProvider", "collapse", "animate", "", "notify", "parentPayload", "", "isChangeChildCollapse", "collapseAndChild", "expand", "isChangeChildExpand", "expandAndChild", "expandAndCollapseOther", "isExpandedChild", "isCollapseChild", "expandPayload", "collapsePayload", "expandOrCollapse", "findParentNode", "node", "flatData", "list", "isExpanded", "(Ljava/util/Collection;Ljava/lang/Boolean;)Ljava/util/List;", "isFixedViewType", "type", "nodeAddData", "parentNode", "childIndex", "nodeRemoveData", "childNode", "nodeReplaceChildData", "nodeSetData", "removeAt", "removeChildAt", "removeNodesAt", "setData", "index", "setDiffNewData", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "commitCallback", "Ljava/lang/Runnable;", "setList", "setNewInstance", "com.github.CymChad.brvah"}, m13414k = 1, m13415mv = {1, 6, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseNodeAdapter extends BaseProviderMultiAdapter<BaseNode> {
    private final HashSet<Integer> fullSpanNodeTypeSet;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseNodeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, boolean z11, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        boolean z12 = z9;
        boolean z13 = (i10 & 4) != 0 ? true : z10;
        boolean z14 = (i10 & 8) != 0 ? true : z11;
        if ((i10 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i9, z12, z13, z14, obj);
    }

    public static /* synthetic */ int collapseAndChild$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapseAndChild");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapseAndChild(i9, z9, z10, obj);
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, boolean z11, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        boolean z12 = z9;
        boolean z13 = (i10 & 4) != 0 ? true : z10;
        boolean z14 = (i10 & 8) != 0 ? true : z11;
        if ((i10 & 16) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i9, z12, z13, z14, obj);
    }

    public static /* synthetic */ int expandAndChild$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndChild");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandAndChild(i9, z9, z10, obj);
    }

    public static /* synthetic */ void expandAndCollapseOther$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, boolean z11, boolean z12, Object obj, Object obj2, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandAndCollapseOther");
        }
        baseNodeAdapter.expandAndCollapseOther(i9, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11, (i10 & 16) == 0 ? z12 : true, (i10 & 32) != 0 ? null : obj, (i10 & 64) != 0 ? null : obj2);
    }

    public static /* synthetic */ int expandOrCollapse$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandOrCollapse");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expandOrCollapse(i9, z9, z10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<BaseNode> flatData(Collection<? extends BaseNode> list, Boolean isExpanded) {
        BaseNode footerNode;
        List<BaseNode> childNode;
        ArrayList arrayList = new ArrayList();
        for (BaseNode baseNode : list) {
            arrayList.add(baseNode);
            if (baseNode instanceof BaseExpandNode) {
                if ((Intrinsics.areEqual(isExpanded, Boolean.TRUE) || ((BaseExpandNode) baseNode).getIsExpanded()) && (childNode = baseNode.getChildNode()) != null && !childNode.isEmpty()) {
                    arrayList.addAll(flatData(childNode, isExpanded));
                }
                if (isExpanded != null) {
                    ((BaseExpandNode) baseNode).setExpanded(isExpanded.booleanValue());
                }
            } else {
                List<BaseNode> childNode2 = baseNode.getChildNode();
                if (childNode2 != null && !childNode2.isEmpty()) {
                    arrayList.addAll(flatData(childNode2, isExpanded));
                }
            }
            if ((baseNode instanceof NodeFooterImp) && (footerNode = ((NodeFooterImp) baseNode).getFooterNode()) != null) {
                arrayList.add(footerNode);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List flatData$default(BaseNodeAdapter baseNodeAdapter, Collection collection, Boolean bool, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: flatData");
        }
        if ((i9 & 2) != 0) {
            bool = null;
        }
        return baseNodeAdapter.flatData(collection, bool);
    }

    private final int removeChildAt(int position) {
        BaseNode baseNode;
        List<BaseNode> childNode;
        if (position >= getData().size() || (childNode = (baseNode = getData().get(position)).getChildNode()) == null || childNode.isEmpty()) {
            return 0;
        }
        if (!(baseNode instanceof BaseExpandNode)) {
            List<BaseNode> childNode2 = baseNode.getChildNode();
            Intrinsics.checkNotNull(childNode2);
            List listFlatData$default = flatData$default(this, childNode2, null, 2, null);
            getData().removeAll(listFlatData$default);
            return listFlatData$default.size();
        }
        if (!((BaseExpandNode) baseNode).getIsExpanded()) {
            return 0;
        }
        List<BaseNode> childNode3 = baseNode.getChildNode();
        Intrinsics.checkNotNull(childNode3);
        List listFlatData$default2 = flatData$default(this, childNode3, null, 2, null);
        getData().removeAll(listFlatData$default2);
        return listFlatData$default2.size();
    }

    private final int removeNodesAt(int position) {
        if (position >= getData().size()) {
            return 0;
        }
        int iRemoveChildAt = removeChildAt(position);
        getData().remove(position);
        int i9 = iRemoveChildAt + 1;
        Object obj = (BaseNode) getData().get(position);
        if (!(obj instanceof NodeFooterImp) || ((NodeFooterImp) obj).getFooterNode() == null) {
            return i9;
        }
        getData().remove(position);
        return iRemoveChildAt + 2;
    }

    public final void addFooterNodeProvider(BaseNodeProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        addFullSpanNodeProvider(provider);
    }

    public final void addFullSpanNodeProvider(BaseNodeProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.fullSpanNodeTypeSet.add(Integer.valueOf(provider.getItemViewType()));
        addItemProvider(provider);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public void addItemProvider(BaseItemProvider<BaseNode> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!(provider instanceof BaseNodeProvider)) {
            throw new IllegalStateException("Please add BaseNodeProvider, no BaseItemProvider!");
        }
        super.addItemProvider(provider);
    }

    public final void addNodeProvider(BaseNodeProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        addItemProvider(provider);
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i9) {
        return collapse$default(this, i9, false, false, null, 14, null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i9) {
        return collapseAndChild$default(this, i9, false, false, null, 14, null);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i9) {
        return expand$default(this, i9, false, false, null, 14, null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i9) {
        return expandAndChild$default(this, i9, false, false, null, 14, null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9) {
        expandAndCollapseOther$default(this, i9, false, false, false, false, null, null, 126, null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i9) {
        return expandOrCollapse$default(this, i9, false, false, null, 14, null);
    }

    public final int findParentNode(BaseNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iIndexOf = getData().indexOf(node);
        if (iIndexOf != -1 && iIndexOf != 0) {
            for (int i9 = iIndexOf - 1; -1 < i9; i9--) {
                List<BaseNode> childNode = getData().get(i9).getChildNode();
                if (childNode != null && childNode.contains(node)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int type) {
        return super.isFixedViewType(type) || this.fullSpanNodeTypeSet.contains(Integer.valueOf(type));
    }

    public final void nodeAddData(BaseNode parentNode, BaseNode data) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + childNode.size(), data);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, int childIndex) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.remove(childIndex);
        } else {
            remove(getData().indexOf(parentNode) + 1 + childIndex);
            childNode.remove(childIndex);
        }
    }

    public final void nodeReplaceChildData(BaseNode parentNode, Collection<? extends BaseNode> newData) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(newData, "newData");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode.clear();
                childNode.addAll(newData);
                return;
            }
            int iIndexOf = getData().indexOf(parentNode);
            int iRemoveChildAt = removeChildAt(iIndexOf);
            childNode.clear();
            childNode.addAll(newData);
            List listFlatData$default = flatData$default(this, newData, null, 2, null);
            int i9 = iIndexOf + 1;
            getData().addAll(i9, listFlatData$default);
            int headerLayoutCount = i9 + getHeaderLayoutCount();
            if (iRemoveChildAt == listFlatData$default.size()) {
                notifyItemRangeChanged(headerLayoutCount, iRemoveChildAt);
            } else {
                notifyItemRangeRemoved(headerLayoutCount, iRemoveChildAt);
                notifyItemRangeInserted(headerLayoutCount, listFlatData$default.size());
            }
        }
    }

    public final void nodeSetData(BaseNode parentNode, int childIndex, BaseNode data) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode == null || childIndex >= childNode.size()) {
            return;
        }
        if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
            childNode.set(childIndex, data);
        } else {
            setData(getData().indexOf(parentNode) + 1 + childIndex, data);
            childNode.set(childIndex, data);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void removeAt(int position) {
        notifyItemRangeRemoved(position + getHeaderLayoutCount(), removeNodesAt(position));
        compatibilityDataSizeChanged(0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(List<BaseNode> list, Runnable commitCallback) {
        if (hasEmptyView()) {
            setNewInstance(list);
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setDiffNewData(flatData$default(this, list, null, 2, null), commitCallback);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setList(Collection<? extends BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setList(flatData$default(this, list, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewInstance(List<BaseNode> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        super.setNewInstance(flatData$default(this, list, null, 2, null));
    }

    public /* synthetic */ BaseNodeAdapter(List list, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ int collapse$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collapse");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.collapse(i9, z9, z10, obj);
    }

    public static /* synthetic */ int expand$default(BaseNodeAdapter baseNodeAdapter, int i9, boolean z9, boolean z10, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expand");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            obj = null;
        }
        return baseNodeAdapter.expand(i9, z9, z10, obj);
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i9, boolean z9) {
        return collapse$default(this, i9, z9, false, null, 12, null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i9, boolean z9) {
        return collapseAndChild$default(this, i9, z9, false, null, 12, null);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i9, boolean z9) {
        return expand$default(this, i9, z9, false, null, 12, null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i9, boolean z9) {
        return expandAndChild$default(this, i9, z9, false, null, 12, null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9, boolean z9) {
        expandAndCollapseOther$default(this, i9, z9, false, false, false, null, null, 124, null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i9, boolean z9) {
        return expandOrCollapse$default(this, i9, z9, false, null, 12, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setData(int index, BaseNode data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int iRemoveNodesAt = removeNodesAt(index);
        List listFlatData$default = flatData$default(this, CollectionsKt.arrayListOf(data), null, 2, null);
        getData().addAll(index, listFlatData$default);
        if (iRemoveNodesAt == listFlatData$default.size()) {
            notifyItemRangeChanged(index + getHeaderLayoutCount(), iRemoveNodesAt);
        } else {
            notifyItemRangeRemoved(getHeaderLayoutCount() + index, iRemoveNodesAt);
            notifyItemRangeInserted(index + getHeaderLayoutCount(), listFlatData$default.size());
        }
    }

    public BaseNodeAdapter(List<BaseNode> list) {
        super(null);
        this.fullSpanNodeTypeSet = new HashSet<>();
        if (list == null || list.isEmpty()) {
            return;
        }
        getData().addAll(flatData$default(this, list, null, 2, null));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, BaseNode data) {
        Intrinsics.checkNotNullParameter(data, "data");
        addData(position, (Collection<? extends BaseNode>) CollectionsKt.arrayListOf(data));
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        return collapse$default(this, i9, z9, z10, null, 8, null);
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        return collapseAndChild$default(this, i9, z9, z10, null, 8, null);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        return expand$default(this, i9, z9, z10, null, 8, null);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        return expandAndChild$default(this, i9, z9, z10, null, 8, null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        expandAndCollapseOther$default(this, i9, z9, z10, false, false, null, null, MenuKt.InTransitionDuration, null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int i9, boolean z9, boolean z10) {
        return expandOrCollapse$default(this, i9, z9, z10, null, 8, null);
    }

    private final int collapse(@IntRange(from = 0) int position, boolean isChangeChildCollapse, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = position + getHeaderLayoutCount();
                baseExpandNode.setExpanded(false);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    Intrinsics.checkNotNull(childNode2);
                    List<BaseNode> listFlatData = flatData(childNode2, isChangeChildCollapse ? Boolean.FALSE : null);
                    int size = listFlatData.size();
                    getData().removeAll(listFlatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeRemoved(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    private final int expand(@IntRange(from = 0) int position, boolean isChangeChildExpand, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (baseNode instanceof BaseExpandNode) {
            BaseExpandNode baseExpandNode = (BaseExpandNode) baseNode;
            if (!baseExpandNode.getIsExpanded()) {
                int headerLayoutCount = getHeaderLayoutCount() + position;
                baseExpandNode.setExpanded(true);
                List<BaseNode> childNode = baseNode.getChildNode();
                if (childNode != null && !childNode.isEmpty()) {
                    List<BaseNode> childNode2 = baseNode.getChildNode();
                    Intrinsics.checkNotNull(childNode2);
                    List<BaseNode> listFlatData = flatData(childNode2, isChangeChildExpand ? Boolean.TRUE : null);
                    int size = listFlatData.size();
                    getData().addAll(position + 1, listFlatData);
                    if (notify) {
                        if (animate) {
                            notifyItemChanged(headerLayoutCount, parentPayload);
                            notifyItemRangeInserted(headerLayoutCount + 1, size);
                            return size;
                        }
                        notifyDataSetChanged();
                    }
                    return size;
                }
                notifyItemChanged(headerLayoutCount, parentPayload);
            }
        }
        return 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(BaseNode data) {
        Intrinsics.checkNotNullParameter(data, "data");
        addData((Collection<? extends BaseNode>) CollectionsKt.arrayListOf(data));
    }

    @JvmOverloads
    public final int collapseAndChild(@IntRange(from = 0) int position, boolean animate, boolean notify, Object parentPayload) {
        return collapse(position, true, animate, notify, parentPayload);
    }

    @JvmOverloads
    public final int expandAndChild(@IntRange(from = 0) int position, boolean animate, boolean notify, Object parentPayload) {
        return expand(position, true, animate, notify, parentPayload);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9, boolean z9, boolean z10, boolean z11) {
        expandAndCollapseOther$default(this, i9, z9, z10, z11, false, null, null, 112, null);
    }

    @JvmOverloads
    public final int expandOrCollapse(@IntRange(from = 0) int position, boolean animate, boolean notify, Object parentPayload) {
        BaseNode baseNode = getData().get(position);
        if (!(baseNode instanceof BaseExpandNode)) {
            return 0;
        }
        if (((BaseExpandNode) baseNode).getIsExpanded()) {
            return collapse(position, false, animate, notify, parentPayload);
        }
        return expand(position, false, animate, notify, parentPayload);
    }

    public final int findParentNode(@IntRange(from = 0) int position) {
        if (position == 0) {
            return -1;
        }
        BaseNode baseNode = getData().get(position);
        for (int i9 = position - 1; -1 < i9; i9--) {
            List<BaseNode> childNode = getData().get(i9).getChildNode();
            if (childNode != null && childNode.contains(baseNode)) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setDiffNewData(DiffUtil.DiffResult diffResult, List<BaseNode> list) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(list, "list");
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            super.setDiffNewData(diffResult, flatData$default(this, list, null, 2, null));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(int position, Collection<? extends BaseNode> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        super.addData(position, (Collection) flatData$default(this, newData, null, 2, null));
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9, boolean z9, boolean z10, boolean z11, boolean z12) {
        expandAndCollapseOther$default(this, i9, z9, z10, z11, z12, null, null, 96, null);
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int i9, boolean z9, boolean z10, boolean z11, boolean z12, Object obj) {
        expandAndCollapseOther$default(this, i9, z9, z10, z11, z12, obj, null, 64, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(Collection<? extends BaseNode> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        super.addData((Collection) flatData$default(this, newData, null, 2, null));
    }

    @JvmOverloads
    public final void expandAndCollapseOther(@IntRange(from = 0) int position, boolean isExpandedChild, boolean isCollapseChild, boolean animate, boolean notify, Object expandPayload, Object collapsePayload) {
        int size;
        int iCollapse = position;
        int iExpand = expand(iCollapse, isExpandedChild, animate, notify, expandPayload);
        if (iExpand == 0) {
            return;
        }
        int iFindParentNode = findParentNode(iCollapse);
        int i9 = iFindParentNode == -1 ? 0 : iFindParentNode + 1;
        if (iCollapse - i9 > 0) {
            do {
                int i10 = i9;
                i9 = i10 + 1;
                iCollapse -= collapse(i10, isCollapseChild, animate, notify, collapsePayload);
            } while (i9 < iCollapse);
        }
        int i11 = iCollapse;
        if (iFindParentNode == -1) {
            size = getData().size() - 1;
        } else {
            List<BaseNode> childNode = getData().get(iFindParentNode).getChildNode();
            size = iFindParentNode + (childNode != null ? childNode.size() : 0) + iExpand;
        }
        int i12 = i11 + iExpand;
        if (i12 < size) {
            int i13 = size;
            int i14 = i12 + 1;
            while (i14 <= i13) {
                int iCollapse2 = collapse(i14, isCollapseChild, animate, notify, collapsePayload);
                i14++;
                i13 -= iCollapse2;
            }
        }
    }

    public final void nodeAddData(BaseNode parentNode, int childIndex, BaseNode data) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(data, "data");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.add(childIndex, data);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, data);
            }
        }
    }

    public final void nodeRemoveData(BaseNode parentNode, BaseNode childNode) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(childNode, "childNode");
        List<BaseNode> childNode2 = parentNode.getChildNode();
        if (childNode2 != null) {
            if ((parentNode instanceof BaseExpandNode) && !((BaseExpandNode) parentNode).getIsExpanded()) {
                childNode2.remove(childNode);
            } else {
                remove((BaseNodeAdapter) childNode);
                childNode2.remove(childNode);
            }
        }
    }

    public final void nodeAddData(BaseNode parentNode, int childIndex, Collection<? extends BaseNode> newData) {
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(newData, "newData");
        List<BaseNode> childNode = parentNode.getChildNode();
        if (childNode != null) {
            childNode.addAll(childIndex, newData);
            if (!(parentNode instanceof BaseExpandNode) || ((BaseExpandNode) parentNode).getIsExpanded()) {
                addData(getData().indexOf(parentNode) + 1 + childIndex, newData);
            }
        }
    }

    @JvmOverloads
    public final int collapse(@IntRange(from = 0) int position, boolean animate, boolean notify, Object parentPayload) {
        return collapse(position, false, animate, notify, parentPayload);
    }

    @JvmOverloads
    public final int expand(@IntRange(from = 0) int position, boolean animate, boolean notify, Object parentPayload) {
        return expand(position, false, animate, notify, parentPayload);
    }
}
