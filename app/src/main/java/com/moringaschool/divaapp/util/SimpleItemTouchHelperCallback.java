package com.moringaschool.divaapp.util;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

//public class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {
////   The method below triggers the callback in ItemTouchHelperViewHolder which is then sent to our
//    //  RestaurantListViewHolder where we will later add animations.
//
//    @Override
//    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
//
//        //  This conditional ensures we only change appearance of active items:
//
//        if (actionState != ItemTouchHelper.ACTION_STATE_IDLE) {
//            if (viewHolder instanceof ItemTouchHelperViewHolder) {
//
//                //  This tells the viewHolder that an item is being moved or dragged:
//
//                ItemTouchHelperViewHolder itemViewHolder = (ItemTouchHelperViewHolder) viewHolder;
//                itemViewHolder.onItemSelected();
//            }
//        }
//        super.onSelectedChanged(viewHolder, actionState);
//    }
//
//    //  This triggers the callback in the ItemTouchHelperViewHolder which will be sent to our RestaurantListViewHolder.
//    //  Then, in the clearView override in RestaurantListViewHolder, we will remove the animations attached
//    //   to 'selected' items, since this item will no longer be actively selected.
//
//    @Override
//    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
//        super.clearView(recyclerView, viewHolder);
//        if (viewHolder instanceof ItemTouchHelperViewHolder) {
//
//            //  Tells the view holder to return the item back to its normal appearance:
//
//            ItemTouchHelperViewHolder itemViewHolder = (ItemTouchHelperViewHolder) viewHolder;
//            itemViewHolder.onItemClear();
//        }
//    }
//}
