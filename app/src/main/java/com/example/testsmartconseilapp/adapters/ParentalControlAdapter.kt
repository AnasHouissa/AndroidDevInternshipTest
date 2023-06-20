
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testsmartconseilapp.databinding.ControlItemBinding
import com.example.testsmartconseilapp.model.Alert
import com.example.testsmartconseilapp.model.App


class ControlAdapter (var apps: MutableList<App>) :RecyclerView.Adapter<ControlAdapter.ControlViewHolder>() {

    inner class ControlViewHolder(val mainView: ControlItemBinding):RecyclerView.ViewHolder(mainView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ControlViewHolder {
        val mainView = ControlItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ControlViewHolder(mainView)
    }

    override fun getItemCount(): Int {
        return apps.size
    }

    override fun onBindViewHolder(holder: ControlViewHolder, position: Int) {
        val app=apps[position]

        if(app.activated){
            holder.mainView.switch1.isChecked=true
            holder.mainView.tvSwichValue.text="On"
        }
        else{
            holder.mainView.switch1.isChecked=false
            holder.mainView.tvSwichValue.text="Off"
        }
        holder.mainView.switch1.setOnCheckedChangeListener { _,isChecked ->
            if(isChecked){
                holder.mainView.tvSwichValue.text="On"
            }
            else{
                holder.mainView.tvSwichValue.text="Off"
            }
        }
        holder.mainView.tvName.text=app.title
        holder.mainView.ivControl.setImageResource(app.pic)

    }

}